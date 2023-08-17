const form = document.querySelector('form');
const productName = document.getElementById('name');
const productPrice = document.getElementById('price');
const productQuantity = document.getElementById('quantity');


form.addEventListener('submit', (event) => {
    event.preventDefault();
    
    const data = {
        productName: productName.value,
        productPrice: productPrice.value,
        productQuantity: productQuantity.value,
    };
});    

const getProducts = () => {
    fetch('http://localhost:8080/api/products')
        .then(res => res.json())
        .then(products => {
            console.log(products);
            products.forEach(product => {

                const name = `<li style="color:white; margin-top:10px; font-size: 20px; font-weight:bold;">${product.name} </li>`;
                const price = `<li>Price: ${product.price} </li>`;
                const quantity = `<li>Quantity: ${product.quantity} </li>`;

                document.querySelector('ul').insertAdjacentHTML('beforeend', name);
                document.querySelector('ul').insertAdjacentHTML('beforeend', price);
                document.querySelector('ul').insertAdjacentHTML('beforeend', quantity);
            });
        })
        .catch(error => console.log(error));
};

const postProducts = () => {
    fetch('http://localhost:8080/api/products', {
        method: 'POST'
    }).then(res => console.log(res.json()))
    .then(products => console.log(products))
    .catch(error => console.log(error));
};

getProducts();

form.addEventListener('submit', event => postProducts());