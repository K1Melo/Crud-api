const form = document.querySelector('form');
const showProducts = document.getElementById('show-products');
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
console.log(showProducts);

showProducts.addEventListener('submit', (event) => {
    console.log('teste');
});
    

const getProducts = () => {
    console.log('iai')
    fetch('http://localhost:8080/api/products')
        .then(res => console.log(res))
        .then(products => console.log(products));
};

form.addEventListener('submit', event => getProducts());