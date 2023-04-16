let inputDOM = document.getElementById("task");
let listDOM = document.getElementById("list");

if (localStorage.hasOwnProperty("list")) {
    localList = JSON.parse(localStorage.getItem("list"));
    localList.forEach(element => {
        writeElement(element);
    });
} else {
    let localList = [];
}



function addElement() {
    if (inputDOM.value || inputDOM.value.trim()) {
        writeElement(inputDOM.value)
        localList.push(inputDOM.value);
        localStorage.setItem("list", JSON.stringify(localList));
        inputDOM.value = "";
    }
}

function deleteElement(parent) {
    let deleted = parent.children[1].innerText;
    localList.splice(localList.indexOf(deleted), 1);
    localStorage.setItem("list", JSON.stringify(localList));
    parent.remove();
}

function writeElement(element) {
    let myitem = `
    <label class="list-group-item border-primary d-flex align-items-center p-2">
      <input class="form-check-input ms-2" type="checkbox" >
      <span class="ms-3">${element}</span>  
      <button type="button" class="btn btn-danger  ms-auto"  onclick="deleteElement(this.parentNode)">X</button>
    </label>
    `;
    listDOM.insertAdjacentHTML("afterbegin", myitem);
}
console.log("3")