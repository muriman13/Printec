
   <h1>Simple project part of an interview process - Cat Breed</h1>
   <h2>Overview</h2>
   <p><Strong> Very basic Spring Application</Strong> (The basic white girl of spring applications) that in its core its just 3 exposed endpoints, simple service logic, a databse and use of an external free Api to get some data <small>about cats</small> 🐱</p>
   <h2>Features</h2>
   <ul>
      <li><strong>CRUD Operations:</strong> Create, read, update, and delete cat breeds.</li>
      <li><strong>External API Integration:</strong> Fetch cat breed data from external sources.</li>
      <li><strong>Containerization:</strong> Docker support for easy deployment.</li>
      <li><strong>CI/CD:</strong> Automated workflows with GitHub Actions for continuous integration and continuous deployment.</li>
   </ul>
   <h2>Prerequisites</h2>
   <ul>
      <li>JDK 17</li>
      <li>Maven 3.6.3 or later (for building the application)</li>
      <li>Docker</li>
      <li>A Docker Hub account</li>
   </ul>
   <h2>Local Setup</h2>
   <ol>
      <li>
         <p><strong>Clone the repository</strong></p>
         <pre>cd</span> Printec
</code></div></div></pre>
      </li>
      <li>
         <p><strong>Build the application</strong></p>
         <pre>mvn clean install
</code></div></div></pre>
      </li>
      <li>
         <p><strong>Build the Docker image</strong></p>
         <pre>docker build -t printectask
</code></div></div></pre>
      </li>
      <li>
         <p><strong>Run the application</strong></p>
         <pre>docker run -p 8080:8080 printectask
</code></div></div></pre>
      </li>
   </ol>
   <p>The application is now accessible at <code>http://localhost:8080</code>.</p>
      
  <strong> If just want to run the latest Image</strong>
      <code><p>docker pull muriman13/printectask:latest
               docker run -d --name printecTaskApp -p 8080:8080 muriman13/printectask:latest</p></code>

   <h2>API Endpoints</h2>
   <ul>
      <li><code>GET /api/catbreeds</code> - Retrieve all cat breeds</li>
      <li><code>POST /api/catbreeds</code> - Create a new cat breed</li>
      <li><code>POST /api/catbreeds/updateFromExternal</code> - Update cat breeds from an external source</li>
   </ul>
   <h2>Deploying with GitHub Actions</h2>
   <p>This project uses GitHub Actions for CI/CD. On every push to the <code>master</code> branch, the GitHub Actions workflow builds the Docker image, runs tests, and pushes the image to Docker Hub. However for whatever reason currently no gha build agent is getting tasked - Myabe the free tier is no more</p>
   <p>After deployment the image should be located in https://hub.docker.com/repository/docker/muriman13/printectask/general</p>
   <h2>Contributing</h2>
   <p>Don't</p>
   <h2>License</h2>
   <p>Free for all</p>
   <hr>
