import React, { Component } from 'react';
import '.././css/table.css';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';

class AccountDetail extends Component {
    render() {
        const {post} = this.props
        return (
            <div>
                <tr>
                    <td> {post.name} </td>
                    <td> {post.balance} </td>
                </tr>
            </div> 
        )
    }
}
export default AccountDetail;