import logo from './logo.svg';
import './App.css';

function App() {
    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo" />
                <h1>Welcome to TheZeynal Platform</h1>
                <p>Güclü ideyalar. Gələcək yönümlü həllər.</p>

                <a
                    className="App-link"
                    href="https://github.com/TheZeynal"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    GitHub Profilinə Keçid
                </a>

                <a
                    className="App-link"
                    href="https://www.youtube.com/@TheZeynalOfficial"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    YouTube Kanalına Bax
                </a>

                <a
                    className="App-link"
                    href="https://www.youtube.com/watch?v=ldLa-Cqdl_E"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    🎵 The Zeyn -X dinle
                </a>
            </header>
        </div>
    );
}

export default App;
