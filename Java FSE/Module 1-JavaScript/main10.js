const events = [
  { name: "Yoga Workshop", date: "2025-06-01", category: "health" },
  { name: "Coding Bootcamp", date: "2025-06-15", category: "education" },
];

function displayEvent({name, date}) {
  return `${name} scheduled on ${date}`;
}

const clonedEvents = [...events];

const output = clonedEvents.map(event => displayEvent(event)).join("<br>");

document.getElementById("output").innerHTML = output;
