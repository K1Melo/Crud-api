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
                const name = `<li>Name: ${product.name} </li>`
                const price = `<li>Price: ${product.price} </li>`
                const quantity = `<li>Quantity: ${product.quantity} </li>`

                document.querySelector('ul').insertAdjacentHTML('beforeend', name);
                document.querySelector('ul').insertAdjacentHTML('beforeend', price);
                document.querySelector('ul').insertAdjacentHTML('beforeend', quantity);
            });
        })
        .catch(error => console.log(error));
};

form.addEventListener('submit', event => getProducts());