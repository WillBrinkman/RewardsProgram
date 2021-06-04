import React, { Component } from 'react';
import './App.css';
import {Table} from 'reactstrap';


class App extends Component {
 state = {purchases : []}
 
 async componentDidMount(){
  const response = await fetch('/api/purchases')
  const body = await response.json();
  this.setState({purchases : body, isLoading: false})
 // console.log(body);
}

render() {
  const {Purchases, isLoading} = this.state

  let rows = 
  Purchases.map( purchase =>
    <tr key = {purchase.id}>
      <td>{purchase.customer_id}</td>
      <td>{purchase.cost}</td>
      <td>{purchase.date}</td>
      <td>{purchase.description}</td>
    </tr>)

    if (isLoading) 
      return(<div>Still Loading</div>)

    return(
      <div>
        <h2> Customer Points Tracker</h2>
        <Table>
          <thead>
            <tr>
              <th>Customer Id</th>
              <th>Cost</th>
              <th>Date</th>
              <th>Descrption</th>
            </tr>
          </thead>
          <tbody>
            {rows}
          </tbody>

        </Table>
      </div>
    )
    }



}
export default App;