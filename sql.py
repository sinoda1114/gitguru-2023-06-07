import sqlite3
from flask import Flask, request

app = Flask(__name__)

@app.route('/user', methods=['GET'])
def get_user():
    user_id = request.args.get('id')
    connection = sqlite3.connect('database.db')
    cursor = connection.cursor()
    cursor.execute(f"SELECT * FROM users WHERE id = {user_id}")
    data = cursor.fetchall()
    return str(data)

if __name__ == '__main__':
    app.run(debug=True)
