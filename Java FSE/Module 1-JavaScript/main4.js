function addEvent(events, event) {
  events.push(event);
  return events;
}

function registerUser(event) {
  if (event.seats > 0) {
    event.seats--;
    return "Registration successful";
  } else {
    return "Event full";
  }
}

function filterEventsByCategory(events, category, callback) {
  return callback(events.filter(e => e.category === category));
}

// Closure to track registrations per category
function registrationTracker() {
  let registrations = 0;
  return function () {
    registrations++;
    return registrations;
  };
}

const trackMusicRegs = registrationTracker();

const events = [
  { name: "Jazz Night", category: "music", seats: 5 },
  { name: "Baking Workshop", category: "cooking", seats: 10 }
];

addEvent(events, { name: "Rock Concert", category: "music", seats: 20 });

const musicEvents = filterEventsByCategory(events, "music", filtered => filtered);

const regMessage = registerUser(musicEvents[0]);
const totalRegs = trackMusicRegs();

document.getElementById("output").innerHTML =
  `Music Events: ${musicEvents.map(e => e.name).join(", ")}<br>` +
  `Register User Message: ${regMessage}<br>` +
  `Total Registrations in Music: ${totalRegs}`;
