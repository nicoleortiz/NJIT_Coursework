import React, { Component } from 'react';

class Search extends Component {
    constructor(props) {
        super(props);
    }

    state = {
        acc: 1
    }

    render() {
        var change = this.props.change;
        return (
            <div>
                <h2>Select An Account</h2>
                <button onClick={() => { change(1) }}>Lannisters</button>
                <button onClick={() => { change(2) }}>Starks</button>
                <button onClick={() => { change(3) }}>Baratheons</button>
                <button onClick={() => { change(4) }}>Targaryens</button>
                <button onClick={() => { change(5) }}>Greyjoys</button>
                <button onClick={() => { change(6) }}>Tyrells</button>
                <button onClick={() => { change(7) }}>Martells</button>
                <button onClick={() => { change(8) }}>Tullys</button>
                <button onClick={() => { change(9) }}>Arryns</button>
                <button onClick={() => { change(10) }}>Free Folk</button>
            </div>
        )
    }
}

export default Search;