let secondsDiv = document.getElementById("seconds");
let minutesDiv = document.getElementById("minutes");
let hoursDiv = document.getElementById("hours");
let daysDiv = document.getElementById("days");

let person = prompt("Adınızı Giriniz");
document.getElementById("greetings").innerHTML = `
Merhaba ${person}. 
Yeni yıla kalan süre:
`

function countdown() {
    
    let t = 31556926000 - (Date.now() % 31556926000);
    
    let seconds = Math.floor((t / 1000) % 60);
    let minutes = Math.floor((t / 1000 / 60) % 60);
    let hours = Math.floor((t / (1000 * 60 * 60)) % 24);
    let days = Math.floor(t / (1000 * 60 * 60 * 24));
    
    
    
    secondsDiv.innerHTML = seconds;
    minutesDiv.innerHTML = minutes;
    hoursDiv.innerHTML = hours;
    daysDiv.innerHTML = days;
}

let i = setInterval(countdown, 1000);