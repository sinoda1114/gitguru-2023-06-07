from flask import Flask, request

app = Flask(__name__)

@app.route('/admin', methods=['GET'])
def admin_page():
    if not is_admin():
        return "Access denied."

    # Admin-only content
    return "Welcome to the admin page."

def is_admin():
    user_id = request.args.get('user_id')
    if user_id == 'admin':
        return True
    else:
        return False

if __name__ == '__main__':
    app.run(debug=True)
