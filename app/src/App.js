import React, { Component } from "react";
import "./App.css";
import { Table } from "reactstrap";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { purchases: [] };
  }

  async componentDidMount() {
    const response = await fetch("/api/purchases");
    const body = await response.json();
    this.setState({ purchases: body });
  }


  render() {
    const { purchases } = this.state;
    let Purchases = purchases.map((obj) =>
      Object.assign(obj, { points: pointsCalculator(obj) }),
    );

//Purchases = groupBy(Purchases, 'month');
  //  Purchases = groupBy(purchases, 'customer');
  Purchases = Purchases.map((obj) => ({ ...obj, month: obj.date.slice(5, 7) }))
 
  //console.log(Purchases);
  
  //console.log(monthlyPurchases);

    let customerPurchases = groupBy(Purchases, 'customer');
  //  console.log(groupBy(purchases, 'customer'))
    console.log(customerPurchases.forEach(this.state.points.sum()));
    let monthlyPurchases = groupBy(Purchases, 'month');
    console.log(monthlyPurchases);
  //customerPurchases.map(groupBy(customerPurchases, 'date'.charAt(5) ))
  //  let customerMonthlyPurchases = groupBy(customerPurchases, 'date'.slice(5,7) )
  //  console.log(customerPurchases);

  
    function pointsCalculator(purchase) {
      let roundedPurchaseCost = Math.floor(purchase.cost);
      let purchasePoints = 0;
  
      if (roundedPurchaseCost > 50) {
        purchasePoints =
          roundedPurchaseCost - 100 > 0
            ? 50 + (roundedPurchaseCost - 100) * 2
            : roundedPurchaseCost - 50;
        return purchasePoints;
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
      }, []);
    }

    function groupByMonth(Arr, property) {
      return Arr.reduce((newArr, obj) => {
        const key = obj[property];
        if (!newArr[key]) {
          newArr[key] = [];
        }
        newArr[key].push(obj);
        return newArr;
      }, []);
    }

      
    let rows = Purchases.map((purchase) => (
        
      <tr key={purchase.id}>
        <td>{purchase.customer}</td>
        <td>${purchase.cost}</td>
        <td>{purchase.date}</td>
        <td>{purchase.description}</td>
        <td>{purchase.points}</td>
      </tr>
    ));

    return (
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
          <tbody>{rows}</tbody>
        </Table>
      </div>
    );
  }
}
export default App;
