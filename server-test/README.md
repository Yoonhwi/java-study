## 🌐 Simple HTTP Server in Java

**Simple HTTP Server**는 Java의 `com.sun.net.httpserver.HttpServer`를 사용하여 간단한 HTTP 서버를 구축하는 예제 프로젝트입니다.  
이 서버는 클라이언트의 요청을 수신하고 간단한 응답을 반환하는 기본적인 HTTP 서버의 동작을 구현합니다.

---

### 📋 프로젝트 개요

이 프로젝트는 Java의 **`HttpServer`**를 활용하여 로컬 환경에서 작동하는 HTTP 서버를 구현합니다.  
사용자는 서버가 제공하는 기본 URL에 요청을 보내 응답 메시지를 받을 수 있습니다.

### 🔧 주요 특징

- **사용한 라이브러리**: `com.sun.net.httpserver.HttpServer`
- **포트 번호**: `8000`
- **기본 경로**: `/test`
- **응답 메시지**: 클라이언트 요청에 대해 간단한 메시지를 반환

---

### 🛠️ 기능 설명

1. **서버 시작**
   - 지정된 포트 번호에서 HTTP 서버를 시작합니다.
2. **요청 처리**
   - 클라이언트가 `/test` 경로로 요청을 보내면 응답 메시지를 반환합니다.
3. **간단한 응답 메시지**
   - 요청을 성공적으로 처리한 후, "Hello, this is a simple HTTP server!" 메시지를 클라이언트에게 반환합니다.

---
