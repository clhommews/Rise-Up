import React from 'react';
import ReactDOM from 'react-dom';

// Rise Up
class RiseUp extends React.Component {
  render() {
    return (
      <div>
        <h1>Rise Up</h1>
        <h2>We Will Never Give Up!</h2>
        <p>Let us be inspired and take action today.</p>
      </div>
    )
  }
}

ReactDOM.render(
  <RiseUp />,
  document.getElementById('root')
);

// CSS
const styles = {
	container: {
		backgroundColor: '#fff',
		border: '2px solid red',
		padding: 20,
		margin: 20
	}
}

// Create a new component
class InspirationalQuote extends React.Component {
	render() {
		return (
			<div>
				<p style={styles.container}>
					"If you want to rise up, then rise up and take action"
				</p>
			</div>
		)
	}
}

// Render the new component
ReactDOM.render(
	<InspirationalQuote />,
	document.getElementById('quote')
)

// Create another new component
class LeadByExample extends React.Component {
	render() {
		return (
			<div>
				<h1>Lead by Example</h1>
				<p>
					Leaders are not born, they are made.
					Leaders rise up from the depths of adversity and create an
					atmosphere of hope and resilience.
				</p>
			</div>
		)
	}
}

// Render the new component
ReactDOM.render(
	<LeadByExample />,
	document.getElementById('leader')
)

// Create another new component
class KeepGoing extends React.Component {
	render() {
		return (
			<div>
				<h1>Keep Going!</h1>
				<p>
					No matter the challenges, never give up.
					Every failure is an opportunity to learn and grow.
				</p>
			</div>
		)
	}
}

// Render the new component
ReactDOM.render(
	<KeepGoing />,
	document.getElementById('going')
)

// Create another new component
class ContributeToSociety extends React.Component {
	render() {
		return (
			<div>
				<h1>Contribute to Society</h1>
				<p>
					Be a part of something larger than yourself.
					Give back what you can and inspire others to do the same.
				</p>
			</div>
		)
	}
}

// Render the new component
ReactDOM.render(
	<ContributeToSociety />,
	document.getElementById('contribute')
)

// Create another new component
class TakeAction extends React.Component {
	render() {
		return (
			<div>
				<h1>Take Action</h1>
				<p>
					Nothing changes if nothing changes.
					It is important to take action now!
				</p>
			</div>
		)
	}
}

// Render the new component
ReactDOM.render(
	<TakeAction />,
	document.getElementById('action')
)

// Create another new component
class BecomeInspired extends React.Component {
	render() {
		return (
			<div>
				<h1>Become Inspired</h1>
				<p>
					Rise up and become inspired.
					Let us all share our stories and stand up for what is right!
				</p>
			</div>
		)
	}
}

// Render the new component
ReactDOM.render(
	<BecomeInspired />,
	document.getElementById('inspire')
)

// Create another new component
class StandForSomething extends React.Component {
	render() {
		return (
			<div>
				<h1>Stand for Something</h1>
				<p>
					Take a stand for something that matters.
					Be a beacon of hope and create positive change in our world.
				</p>
			</div>
		)
	}
}

// Render the new component
ReactDOM.render(
	<StandForSomething />,
	document.getElementById('stand')
)

// Create another new component
class BelieveInYourself extends React.Component {
	render() {
		return (
			<div>
				<h1>Believe in Yourself</h1>
				<p>
					Believe in yourself and what you can do.
					Be confident and strive for greatness.
				</p>
			</div>
		)
	}
}

// Render the new component
ReactDOM.render(
	<BelieveInYourself />,
	document.getElementById('believe')
)

// Create another new component
class GetSupport extends React.Component {
	render() {
		return (
			<div>
				<h1>Get Support</h1>
				<p>
					Surround yourself with people who believe in you.
					Be strong and get the support you need.
				</p>
			</div>
		)
	}
}

// Render the new component
ReactDOM.render(
	<GetSupport />,
	document.getElementById('support')
)

// Create another new component
class BelieveInTomorrow extends React.Component {
	render() {
		return (
			<div>
				<h1>Believe in Tomorrow</h1>
				<p>
					Tomorrow is a new day and a new opportunity.
					Believe in the possibilities and never give up.
				</p>
			</div>
		)
	}
}

// Render the new component
ReactDOM.render(
	<BelieveInTomorrow />,
	document.getElementById('tomorrow')
)