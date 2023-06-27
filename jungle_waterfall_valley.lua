--[[
-- RISE UP --

1.  local coloredBackground = function(color)
		local gfx = love.graphics
		local width, height = gfx.getDimensions()
		gfx.setColor(color)
		gfx.rectangle("fill", 0, 0, width, height)
	end
	
2. local drawText = function(x,y,textStr,size,font,color) 
		local gfx = love.graphics
		gfx.setFont(font, size)
		gfx.setColor(color)
		gfx.print(textStr,x,y)
	end
	
3. local drawRiseUp = function ()
		local gfx = love.graphics
		local width, height = gfx.getDimensions()
		
		gfx.translate(width/2, height/2)
		
		gfx.setLineWidth(10)
		gfx.push()
		gfx.rotate(math.pi/4)
		gfx.setColor(255,196,0)
		gfx.line(-width/2, -height/2, width/2, -height/2)
		gfx.line(width/2, -height/2, width/2, height/2)
		gfx.line(-width/2, -height/2, -width/2, height/2)
		gfx.line(width/2, height/2, -width/2, height/2)
		gfx.setLineWidth(1)
		gfx.pop()
		
		drawText(-225, -125, "RISE", 75, "Verdana", {255,196,0})
		drawText(-50, -125, "UP", 75, "Verdana", {255,196,0})
	end
	
4.  local draw = function ()
		local gfx = love.graphics
		gfx.clear(255,255,255)
		
		coloredBackground({255,162,0})
		drawRiseUp()
	end
	
5.  function love.draw()
		draw()
	end
	
6.  local update = function (dt)
		
	end
	
7.  function love.update(dt)
		update(dt)
	end
	
8.  function love.load()
		local font = love.graphics.newFont("Arial.ttf", 75)
		love.graphics.setFont(font)
	end
	
9.  function love.keypressed(key)
	  if key == 'escape' then
		love.event.quit()
	 end
	end

10.  local resizeCanvas = function()
		local gfx = love.graphics
		local width, height = gfx.getDimensions()
		local newwidth, newheight = love.window.getDesktopDimensions(1)
		gfx.setMode(newwidth, newheight)
	end
	
11.  function love.resize()
		resizeCanvas()
	end
	
12.  local animate = function(dt)
		
	end
	
13.  function love.run()
		if love.math then
			love.math.setRandomSeed(os.time())
		end
		if love.load then love.load(arg) end
	
		-- We don't want the first frame's dt to include time taken by love.load.
		if love.timer then love.timer.step() end
	
		local dt = 0
		
		-- Main loop time.
		while true do
			-- Process events.
			if love.event then
				love.event.pump()
				for name, a,b,c,d,e,f in love.event.poll() do
					if name == "quit" then
						if not love.quit or not love.quit() then
							return a
						end
					end
					love.handlers[name](a,b,c,d,e,f)
				end
			end
		
			-- Update dt, as we'll be passing it to update
			if love.timer then
				love.timer.step()
				dt = love.timer.getDelta()
			end
		
			-- Call update and draw
			if love.update then love.update(dt) end -- will pass 0 if love.timer is disabled
			animate(dt)
			if love.window and love.graphics and love.window.isCreated() then
				love.graphics.clear()
				love.graphics.origin()
				if love.draw then love.draw() end
				love.graphics.present()
			end
		
			if love.timer then love.timer.sleep(0.001) end
		end
	
	end

--]]