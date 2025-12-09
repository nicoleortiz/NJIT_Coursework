import React from 'react';

class PageTabs extends React.Component {

    isActiveTab(tabName) {
        return (tabName === this.props.currentView) ? 'nav-link active' : 'nav-link';
    }

    onTabClick(event, tabName) {
        event.preventDefault();
        this.props.onViewChange(tabName);
    }

    render() {
        return (
            <ul className='nav page-tabs'>
                <li className='nav-item'>
                    <a className={this.isActiveTab('home')}
                        onClick={(e) => this.onTabClick(e, 'home')}>
                        Home
                    </a>
                </li>
                <li className='nav-item'>
                    <a className={this.isActiveTab('accounts')}
                        onClick={(e) => this.onTabClick(e, 'accounts')}>
                        Accounts
                    </a>
                </li>
                <li className='nav-item'>
                    <a className={this.isActiveTab('transactions')}
                        onClick={(e) => this.onTabClick(e, 'transactions')}>
                        Transactions
                    </a>
                </li>
                <li className='nav-item'>
                    <a className={this.isActiveTab('summary')}
                        onClick={(e) => this.onTabClick(e, 'summary')}>
                        Summaries
                    </a>
                </li>
            </ul>
        )
    }

};

export default PageTabs;