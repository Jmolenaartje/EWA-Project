export default class NotesRepository {
    async getNotes(userId) {
        const response = await fetch('http://localhost:8089/notes/user/' + userId);
        return await response.json();
    }

    async getNoteById(noteId) {
        const response = await fetch('http://localhost:8089/notes/' + noteId);
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

    async deleteNoteById(noteId) {
        const response = await fetch('http://localhost:8089/notes/' + noteId, {
            method: 'DELETE',
        });
        return await response.json();
    }

    async updateNoteById(noteId, userId, note) {
        const response = await fetch('http://localhost:8089/notes/' + noteId, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({userId, note}),
        });
        return await response.json();
    }
}