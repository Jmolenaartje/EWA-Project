export default class NotesRepository {
    async getNotes(userId) {
        const response = await fetch('http://localhost:8089/notes/user/' + userId);
        return await response.json();
    }
}