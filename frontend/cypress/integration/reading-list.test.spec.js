describe('example to-do app', () => {
  beforeEach(() => {
    cy.visit('http://localhost:4200')
  })

  it('shows book list of all books', () => {
    cy.contains("home works!");

    cy.intercept('GET', '**/api/books', {fixture: 'book-example.json'})
      .as('getBooks');

    cy.get(".ui.menu")
      .find('[data-cy=books-menu-item]')
      .click();

    cy.wait('@getBooks')
      .its('response.statusCode')
      .should('eq', 200);


  })
});
