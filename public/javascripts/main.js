//const app = function(){
//    if (document.getElementById('select-item-submit') !== null) {
//        const selectItemSubmit = document.getElementById('select-item-submit');
//        selectItemSubmit.addEventListener('click', onItemSelectButtonClicked);
//    }
//};
//
//const onItemSelectButtonClicked = function(event) {
//    event.preventDefault();
//
//    const items = document.getElementsByName('itemId');
//    for (let item of items) {
//        if (item.checked) {
//            newSale(item.value);
//        }
//    }
// };
//
//const newSale = function(itemId) {
//    const mainContent = document.getElementById('main-content');
//    const form = document.getElementById('select-item-form');
//    const description = document.getElementById('description');
//    mainContent.removeChild(form);
//    mainContent.removeChild(description);
//
//    const subHeading = document.createElement('h2');
//    subHeading.innerText = "Purchase Item";
//    mainContent.appendChild(subHeading);
//};
//
//document.addEventListener('DOMContentLoaded', app);