import logo from './logo.svg';
import './App.css';
import { Component } from 'react';
import { Row, Col, Card } from 'react-bootstrap';
import BootstrapTable from './components/BootstrapTable';

class App extends Component {
	state = {
		isLoading: true,
    users: [],
    offers: []
	};

	async componentDidMount() {
		const responseUsers = await fetch('/api/user');
    const bodyUsers = await responseUsers.json();
    const responseOffers = await fetch('/api/offer');
    const bodyOffers = await responseOffers.json();
		this.setState({ users: bodyUsers, offers: bodyOffers, isLoading: false });
	}
	
	render() {
    const {users, isLoading} = this.state;

    const columns = [
      {Header: 'Price', accessor: 'price'},
      {Header: 'Expire Date', accessor: 'expireDate'},
      {Header: 'Addition Date', accessor: 'additionDate'},
      {Header: 'Is Sold', accessor: 'isSold'}
    ]

    if(isLoading) {
      return <p>Loading...</p>
    }

		return (
      // <div className="App">
      //   <header className="App-header">
      //     <img src={logo} className="App-logo" alt="logo" />
      //     <div className="App-intro">
      //       <h2>Users list</h2>
      //       {users.map(user =>
      //         <div key={user.idUser}>
      //           {user.name}
      //         </div>
      //       )}
      //     </div>
      //   </header>
        <Row>
          <Col>
              <Card>
                <Card.Header>
                  <Card.Title as="h5">Oferty</Card.Title>
                </Card.Header>
                <Card.Body>
                  <BootstrapTable columns={columns} data={this.state.offers} />
                </Card.Body>
              </Card>
          </Col>
        </Row>
      // </div>
		);
	}
}

export default App;
