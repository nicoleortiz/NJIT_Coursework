import React, { Component } from 'react';
import axios from 'axios';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import SummaryTrans from './SummaryTrans.js';
import SummaryAcc from './SummaryAcc.js';
import Search from './Search.js';

class Summary extends Component {
    constructor(props) {
        super(props);
    }

    state = {
        acc: 1,
        allAccounts: [],
        allTransactions: [],
        errorText: ''
    }

    componentDidMount() {
        this.getAccounts();
        this.getTransactions();
    }

    getAccounts() {
        const acc = this.state.acc;

        axios.get(`https://my-json-server.typicode.com/nicoleortiz/Database322Final/accounts`)
            .then(response => {
                this.setState({ allAccounts: response.data });
            }).catch(error => {
                this.setState({ errorMessage: error.message });
            });
    }

    getTransactions() {
        axios.get(`https://my-json-server.typicode.com/nicoleortiz/Database322Final/transactions`)
            .then(response => {
                this.setState({ allTransactions: response.data });
            }).catch(error => {
                this.setState({ errorMessage: error.message });
            });
    }

    change = (x) => {
        this.setState({ acc: x });
    }

    render() {
        return (
            <div>
                <Search change={this.change} />

                <br/>

                <h2>Account Summary</h2>
                {
            this.state.allAccounts.map((item, index) => {
                if (item._id == this.state.acc) {
                    return <SummaryAcc post={item} key={`acc-list-key ${index}`} />
                }})}

                <br />

                <h2> Activity: </h2>
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
                        if (item.accountId == this.state.acc) {
                            return <SummaryTrans post={item} key={`tran-list-key ${index}`} />
                        }})}
                </table>
            </div>
        )
    }
}

export default Summary;