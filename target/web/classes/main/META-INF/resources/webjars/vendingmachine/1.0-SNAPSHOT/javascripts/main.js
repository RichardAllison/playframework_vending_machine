const app = function(){
  populateVendingMachine();
  this.moneyPaid = 0;
  console.log(this.moneyPaid);
};

const populateVendingMachine = function(){
  const vendingItemsForm = document.getElementById('select-item');
//  const items = [{name: "A", price: "$0.65"}, {name: "B", price: "$1.00"}, {name: "C", price: "$1.50"}]
  const coinsForm = document.getElementById('coin-select');

  const dime = document.getElementById('dime');
  dime.addEventListener('click', onCoinSelected);
  const nickel = document.getElementById('nickel');
  nickel.addEventListener('click', onCoinSelected);
  const quarter = document.getElementById('quarter');
  quarter.addEventListener('click', onCoinSelected);
  const dollar = document.getElementById('dollar');
  dollar.addEventListener('click', onCoinSelected);

//  items.forEach(function(item, index){
//    const input = document.createElement('input');
//    input.setAttribute('type', 'radio');
//    input.setAttribute('name', 'items');
//    input.value = index;
//    input.id = `item-${index}`
//    vendingItemsForm.appendChild(input);
//    const label = document.createElement('label');
//    label.setAttribute('for', `item-${index}`);
//    label.innerText = `${item.name}: ${item.price}`;
//    vendingItemsForm.appendChild(label);
//  });
  const submit = document.getElementById('select-item-submit');
//  const submit = document.createElement('input');
//  submit.setAttribute('type', 'submit');
//  submit.setAttribute('name', 'select-item-submit');
//  submit.id = 'select-item-submit';
//  submit.value = 'Select'
  submit.addEventListener('click', onItemSelectButtonClicked);
//  vendingItemsForm.appendChild(submit);
};

const onCoinSelected = function(event){
  console.log(event.target)
  const coinValue = parseInt(event.target.value);
  this.moneyPaid += coinValue;

  const dueDisplay = document.getElementById('due-display');
  const paidDisplay = document.getElementById('paid-display');

  paidDisplay.innerText = `$${this.moneyPaid}`;
  // const jsonString = JSON.stringify(moneyPaid);
  // localStorage.setItem('moneyPaid', jsonString);
};

const onItemSelectButtonClicked = function(event){
  event.preventDefault();

  if (checkNoItemSelected()) {

    const itemDisplay = document.getElementById('item-display');
    const priceDisplay = document.getElementById('price-display');
    const dueDisplay = document.getElementById('due-display');
    const paidDisplay = document.getElementById('paid-display');

    items.forEach(function(item, index){
      if (event.target.form[index].checked === true) {
        itemDisplay.innerText = item.name;
        priceDisplay.innerText = item.price;
        dueDisplay.innerText = item.price;
        paidDisplay.innerText = '$0.00';

        // const jsonString = JSON.stringify(item);
        // localStorage.setItem('selectItem', jsonString);
      } else {
        return;
      }
    });
  }

};

const checkNoItemSelected = function(){
  const itemDisplay = document.getElementById('item-display');
  return (itemDisplay.innerText.length === 0);
};

document.addEventListener('DOMContentLoaded', app);
