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

const logIn = () => {
    // Error here
    fetch('http://localhost:8080/api/products',
        {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': 'http://localhost:8080/api/products',
                'Access-Control-Allow-Credentials': 'true'
            },
            method: 'POST',
            body: JSON.stringify({        
                productName: productName.value,
                productPrice: productPrice.value,
                productQuantity: productQuantity.value
            })
        }
    ).then(res => {console.log(res)})
    .catch(res => console.log(res))
};

form.addEventListener('submit', event => logIn());