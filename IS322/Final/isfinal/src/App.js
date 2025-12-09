import React, { Component } from 'react';

import Home from './home/home.js';
import Accounts from './posts/Accounts.js';
import Transactions from './posts/Transactions.js';
import PageTabs from './tabs/PageTabs.js';
import Summary from './summary/Summary.js';

class App extends Component {
    state = {
        view: 'home'
    }

    onViewChange(view) {
        this.setState({ view });
    }

    wrapPage(jsx) {
        const { view } = this.state;
        return (
            <div className="container">
                <PageTabs currentView={view}
                    onViewChange={this.onViewChange.bind(this)} />
                {jsx}
            </div>
        );
    }

    render() {
        const { view } = this.state;

        switch (view) {
            case 'home':
                return (this.wrapPage(
                    <Home />
                ));
            case 'accounts':
                return (this.wrapPage(
                    <Accounts />
                ));
            case 'transactions':
                return (this.wrapPage(
                    <Transactions />
                ));
            case 'summary':
                return (this.wrapPage(
                    <Summary />
                ))
        }
    }
}

export default App;
