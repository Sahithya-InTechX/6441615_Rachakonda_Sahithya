const events = [
  { name: "Jazz Night", category: "music" },
  { name: "Football Match", category: "sports" },
  { name: "Rock Concert", category: "music" }
];

const container = document.querySelector("#eventsContainer");
const filter = document.querySelector("#categoryFilter");
const searchInput = document.querySelector("#searchInput");

function renderEvents(list) {
  container.innerHTML = "";
  list.forEach(event => {
    const div = document.createElement("div");
    div.textContent = `${event.name} (${event.category})`;
    container.appendChild(div);
  });
}

filter.onchange = () => {
  const filtered = filter.value ? events.filter(e => e.category === filter.value) : events;
  renderEvents(filtered);
};

searchInput.onkeydown = (e) => {
  if (e.key === "Enter") {
    const searchTerm = searchInput.value.toLowerCase();
    const filtered = events.filter(e => e.name.toLowerCase().includes(searchTerm));
    renderEvents(filtered);
  }
};

// Initial render
renderEvents(events);
