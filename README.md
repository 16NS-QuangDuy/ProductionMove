Đồ án tốt nghiệp GR!
Sử dụng JDK 18 trên Intelliji

# Ứng dụng quản lý vòng đời sản phẩm

## Nội dung
1. [Công nghệ sử dụng](#tech)
2. [Yêu cầu môi trường](#environment)
3. [Hướng dẫn chạy](#run)

<a name="tech"></a>
## Công nghệ sử dụng
* Front - end : [ReactJS](https://reactjs.org/)
* Back - end : [SpringBoot](https://spring.io/), [JDK18]()
* Database : [MySQL8](https://dev.mysql.com/downloads/installer/)

<a name="environment"></a>
## Yêu cầu môi trường
* [JDK18](https://www.oracle.com/vn/java/technologies/javase/jdk18-archive-downloads.html)
* [MySQL 8+](https://dev.mysql.com/downloads/installer/)
* [NodeJS](https://nodejs.org/en/)

<a name="run"></a>
## Hướng dẫn chạy ứng dụng
### Backend
1. Tạo một cơ sở dữ liệu mới (đặt tên tùy ý)
2. Sửa các trường sau theo cài đặt MySQL trên máy
```
spring.datasource.url=jdbc:mysql://localhost:3306/<database_name>
spring.datasource.username=<mysql_username>
spring.datasource.password=<mysql_password>
```
Ví dụ
````
spring.datasource.url=jdbc:mysql://localhost:3306/jobfinder
spring.datasource.username=root
spring.datasource.password=12345
````
3. Chạy class `App` `src/main/java/com.hust.productionmove/App`

Server Backend sẽ chạy trên port `5000`

### Front - end
* Từ thư mục gốc của project, `cd` đến mục `src/main/reactjs` 
```bash
cd src/main/reactjs
```
* Chạy `npm i` để cài thư viện
* Chạy `npm start` để chạy server

Server front-end sẽ chạy trên port `3000`
