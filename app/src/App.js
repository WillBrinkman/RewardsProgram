import React, { Component } from 'react';
import './App.css';
import {Table} from 'reactstrap';


class App extends Component {

  constructor(props){
    super(props)
    this.state = {purchases : []}
  }
 
 async componentDidMount(){
  const response = await fetch('/api/purchases')
  const body = await response.json();
  this.setState({purchases : body})
  //let {newPurchases} = purchases.map(v => Object.assign(v, { cost: 0}))

 // console.log(body);
}



render() {
  const {purchases} = this.state
  let Purchases = purchases.map(purchase => Object.assign(purchase, { points: pointsCalculator(purchase)}))
 Purchases = groupBy(purchases, purchases.customerid)
  //console.log(groupedPurchases);

      function pointsCalculator(purchase) {
        let roundedPurchaseCost = (Math.floor(purchase.cost));
        let purchasePoints = 0;

        if (roundedPurchaseCost > 50){
          purchasePoints = roundedPurchaseCost - 100 > 0 ? 50 + (roundedPurchaseCost-100)*2 :  roundedPurchaseCost - 50
          return purchasePoints
      }
      return purchasePoints;
    }

    function groupBy(Arr, property) {
      return Arr.reduce((newArr, obj) => {
        const key = obj[property];
        if (!newArr[key]) {
           newArr[key] = [];
        }
        newArr[key].push(obj);
        return newArr;
     }, {});
  }


 // let Purchases = purchases.map( purchase => pointsCalculator(purchase))
  
 //Purchases.forEach(purchase => {v.points = pointsCalculator(purchase);}) ???

//   let cost = (Math.floor(purchase.cost))
//   if ((Math.floor(purchase.cost)) > 50){
//     purchase.points = cost - 100 > 0 ? 50 + (cost-100)*2 :  cost - 50
// }

  let rows = 
  Purchases.map( purchase => 

    <tr key = {purchase.id}>
      <td>{purchase.customer}</td>
      <td>${purchase.cost}</td>
      <td>{purchase.date}</td>
      <td>{purchase.description}</td>
      <td>{purchase.points}</td>
    </tr>)

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
              <th>Points</th>
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
