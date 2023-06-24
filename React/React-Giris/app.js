import axios from "axios"

export default async function getData(number){
    try {
        const response =  await axios("https://jsonplaceholder.typicode.com/users/" + number)
        console.log(response)
    } catch (error) {
        console.log("hata");
    }    
}

