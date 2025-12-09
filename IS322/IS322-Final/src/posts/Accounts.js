import React, { Component } from 'react';
import axios from 'axios';
import AccountDetail from './AccountDetail.js';
import '.././css/table.css';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';


/*Database From File*/
import AccountsData from '.././data/accounts.json';
/* Code to Summon: 
    {AccountsData.map((item, index) => {
        return <AccountDetail post={item} key={`acc-list-key ${index}`}/>
    })}
*/

class Accounts extends Component {
    state = {
        view: 'list',
        allAccounts: [],
        errorText: ''
    }

    componentDidMount() {
        this.getAccounts();
    }

    getAccounts() {
        axios.get(`https://my-json-server.typicode.com/nicoleortiz/Database322Final/accounts`)
            .then(response => {
                this.setState({ allAccounts: response.data });
            }).catch(error => {
                this.setState({ errorMessage: error.message });
            });
    }

    render() {
        return (
            <div>
                <br/>
                <h3> Click on a Account to see detail </h3>
                <br/>
                <table class="table">
                    <thead class="thead-dark">
                        <tr>
                            <th> Account Name </th>
                            <th> Balance </th>
                        </tr>
                    </thead>
                   
                    {this.state.allAccounts.map((item, index) => {
                        return <AccountDetail post={item} key={`acc-list-key ${index}`} />
                    })}
                </table>
            </div>
        )
    }
}

export default Accounts;