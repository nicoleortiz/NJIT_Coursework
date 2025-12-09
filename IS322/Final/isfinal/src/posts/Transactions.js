import React, { Component } from 'react';

/*Database From File*/
import AccountsData from '.././data/transactions.json';
/* Code to Summon: 
    {TransactionsData.map((item, index) => {
        return <TransactionDetail post={item} key={`tran-list-key ${index}`}/>
    })}
*/

/*Database from Axios*/
import axios from 'axios';

import TransactionDetail from './TransactionDetail.js';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';

class Transactions extends Component {
    state = {
        view: 'list',
        allTransactions: [],
        errorText: ''
    }

    componentDidMount() {
        this.getTransactions();
    }

    getTransactions() {
        axios.get(`https://my-json-server.typicode.com/nicoleortiz/Database322Final/transactions`)
            .then(response => {
                this.setState({ allTransactions: response.data });
            }).catch(error => {
                this.setState({ errorMessage: error.message });
            });
    }

    render() {
        return (
            <div>
                <table class="table">
                    <thead class="thead-dark">
                        <tr>
                            <th> Account ID </th>
                            <th> Type </th>
                            <th> Amount </th>
                            <th> Name </th>
                        </tr>
                    </thead>

                    {this.state.allTransactions.map((item, index) => {
                        return <TransactionDetail post={item} key={`tran-list-key ${index}`} />
                    })}
                </table>
            </div>
        )
    }
}

export default Transactions;