import React, { Component } from 'react';

class SummaryTrans extends Component {
    render() {
        const { post } = this.props
        return (
            <div>
                <tr>
                    <td> {post.accountId} </td>
                    <td> {post.type} </td>
                    <td> {post.amount} </td>
                    <td> {post.name} </td>
                </tr>
            </div>
        )
    }
}

export default SummaryTrans;