export default class UserRepository {
    async getUserAll(userId) {
        const response = await fetch('http://localhost:8089/user/all' + userId);
        return await response.json();
    }

    async getUserById(userId) {
        const response = await fetch('http://localhost:8089/notes/' + userId);
        return await response.json();
    }

    async createUser(user) {
        const response = await fetch('http://localhost:8089/user/add/', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({user}),
        });
        return await response.json();
    }

    async deleteUserById(user) {
        const response = await fetch('http://localhost:8089/user/' + userId, {
            method: 'DELETE',
        });
        return await response.json();
    }

    async updateUserById( userId, user) {
        const response = await fetch('http://localhost:8089/user/' + userId, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({userId, user}),
        });
        return await response.json();
    }
}