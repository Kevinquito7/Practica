const apiUrl="http://localhost:8081/estudiante";

interface estudiante{
    id:number,
    nombre: string,
    apellido: string,
    edad:number
}


interface estudiante extends Array<estudiante>{}

async function fetchCharacters(){
    const response = await fetch(apiUrl);
    const data = await response.json();
    console.log(data)
    displayCharacters(data as estudiante);
}

function displayCharacters (characters: estudiante){ 
    const container = document.getElementById('characters-container');
    if (container){
        characters.forEach(character =>{ 
            container.innerHTML += `
            <div class="character-card">
            <h2>${character.id}</h2>
            <h2>${character.nombre}</h2>
            <h2>${character.apellido}</h2>
            <h2>${character.edad}</h2>
            </div>
            ` ;
        });
    }
}

fetchCharacters();