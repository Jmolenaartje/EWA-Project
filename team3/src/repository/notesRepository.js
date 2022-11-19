export default class NotesRepository {
    async getNotes(userId) {
        const response = await fetch('http://localhost:8089/notes/user/' + userId);
        return await response.json();
    }

    async createNote(userId, note) {
        const response = await fetch('http://localhost:8089/notes/add/', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({userId, note}),
        });
        return await response.json();
    }
}