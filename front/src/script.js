const getProducts = () => {
    fetch('http://localhost:8080/api/products')
    .then(res => res.json())
    .then(products => {
        products.forEach(product => {

            const name = `<button class="delete"></button><li id="nameProduct">${product.name} </li>`;
            const price = `<li>Price: ${product.price} </li>`;
            const quantity = `<li>Quantity: ${product.quantity} </li>`;
                
            document.querySelector('ul').insertAdjacentHTML('beforeend', name);
            document.querySelector('ul').insertAdjacentHTML('beforeend', price);
            document.querySelector('ul').insertAdjacentHTML('beforeend', quantity);
        });
    })
    .catch(error => console.log(error));
};    
getProducts();

const form = document.querySelector('form');
const productName = document.getElementById('name');
const productPrice = document.getElementById('price');
const productQuantity = document.getElementById('quantity');

form.addEventListener('submit', (event) => {
    event.preventDefault();
    window.onload;
});    

const postProducts = () => {
    fetch("http://localhost:8080/api/products", {
        method: 'POST',
        headers: {
            "Content-Type": 'application/json'
        },
        body: JSON.stringify({
            name: productName.value, 
            price: Number(productPrice.value), 
            quantity: Number(productQuantity.value)
        })
    })
    .then(res => res.json())
    .then(product => console.log(product))
    .catch(error => console.log(error));
};


form.addEventListener('submit', event => postProducts());