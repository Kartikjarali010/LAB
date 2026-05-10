
import React

, { Component } from 'react';

// 1. React Functional Component
const WelcomeMessage = () => {
  return (
    <div style={{ border: '1px solid blue', padding: '10px', margin: '10px' }}>
      <h1>Hello from a Functional Component!</h1>
      <p>This is the modern way to write React using functions.</p>
    </div>
  );

};

// 2. React Class-based Component
class UserProfile extends Component {

    render() {
        return (
                <div   style =
        {
            {
                border:   '1px solid green'
                , padding: '10px'
                , margin: '10px'
                }
            }
                    > <h2>
            User Profile (Class Component) < /h2
                    > <p>
            User Name
            : {this.props.name
            } < /p
                    > <p>
            Class components use the render() method to show UI. < /p
                    > < / div >
        

    
    );
  }
}

// Main App Component merging both
function App() {
        return (
                <div  className =   "App"
                > <h1 style =
        {
            {
                textAlign: 'center'
            }
        }
    

> React Component Demonstration < /h1
                > <WelcomeMessage  /
                > <UserProfile name = "cmh" /
                > < / div >
    

);
}

export default App;
