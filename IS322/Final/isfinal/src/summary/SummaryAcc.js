import React, { Component } from 'react';

class SummaryAcc extends Component {
    render() {
        const { post } = this.props
        return (
            <div>
                <p>{post.name} has ${post.balance}</p>
                {this.props.acc}
            </div>
        )
    }
}

export default SummaryAcc;