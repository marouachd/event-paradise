const placesUrl = "http://localhost:8080/places";
const placesContent = `<option selected disabled value="">Choisir un lieu dans la liste</option>`;
const placesSelector = "#place";

const topicsUrl = "http://localhost:8080/topics";
const topicsContent = `<option selected value="">Choisir un thème dans la liste</option>`;
const topicsSelector = "#topic";

load(placesUrl, placesSelector, placesContent)
load(topicsUrl, topicsSelector, topicsContent)

async function load(url, idSelector, content) {

    const options = {
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    };


    const response = await fetch(url, options);
    const elements = await response.json();
    const target = document.querySelector(idSelector);

    console.log(elements);


    elements.forEach(element => {
        content += elementTemplate(element);
    });
    target.innerHTML = content;
}

function elementTemplate(element) {
    return ` 
    <option value="${element.id}">${element.name}</option>
    `;
}