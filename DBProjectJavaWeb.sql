USE [master]
GO
/****** Object:  Database [Project_Java_Web]    Script Date: 6/30/2021 5:34:07 AM ******/
CREATE DATABASE [Project_Java_Web]
 CONTAINMENT = NONE
 ON  PRIMARY 
GO
ALTER DATABASE [Project_Java_Web] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Project_Java_Web].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Project_Java_Web] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Project_Java_Web] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Project_Java_Web] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Project_Java_Web] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Project_Java_Web] SET ARITHABORT OFF 
GO
ALTER DATABASE [Project_Java_Web] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Project_Java_Web] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Project_Java_Web] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Project_Java_Web] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Project_Java_Web] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Project_Java_Web] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Project_Java_Web] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Project_Java_Web] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Project_Java_Web] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Project_Java_Web] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Project_Java_Web] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Project_Java_Web] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Project_Java_Web] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Project_Java_Web] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Project_Java_Web] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Project_Java_Web] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Project_Java_Web] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Project_Java_Web] SET RECOVERY FULL 
GO
ALTER DATABASE [Project_Java_Web] SET  MULTI_USER 
GO
ALTER DATABASE [Project_Java_Web] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Project_Java_Web] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Project_Java_Web] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Project_Java_Web] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Project_Java_Web] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Project_Java_Web] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'Project_Java_Web', N'ON'
GO
ALTER DATABASE [Project_Java_Web] SET QUERY_STORE = OFF
GO
USE [Project_Java_Web]
GO
/****** Object:  Table [dbo].[Cart]    Script Date: 6/30/2021 5:34:07 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart](
	[cartId] [int] IDENTITY(1,1) NOT NULL,
	[userId] [int] NOT NULL,
	[productId] [int] NOT NULL,
	[quantity] [int] NOT NULL,
 CONSTRAINT [PK_Cart] PRIMARY KEY CLUSTERED 
(
	[cartId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 6/30/2021 5:34:07 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[categoryId] [int] NOT NULL,
	[categoryName] [nvarchar](150) NULL,
	[categoryImage] [nvarchar](150) NULL,
 CONSTRAINT [PK_Categories] PRIMARY KEY CLUSTERED 
(
	[categoryId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 6/30/2021 5:34:07 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[orderId] [int] IDENTITY(1,1) NOT NULL,
	[userId] [int] NULL,
	[productId] [int] NULL,
	[quantity] [int] NULL,
	[orderDate] [date] NULL,
	[status] [varchar](50) NULL,
 CONSTRAINT [PK_Orders] PRIMARY KEY CLUSTERED 
(
	[orderId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 6/30/2021 5:34:07 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[productId] [int] IDENTITY(1,1) NOT NULL,
	[categoryId] [int] NOT NULL,
	[productName] [nvarchar](200) NOT NULL,
	[price] [float] NOT NULL,
	[size] [varchar](50) NOT NULL,
	[quantity] [int] NOT NULL,
	[productDescription] [nvarchar](max) NOT NULL,
	[image] [text] NOT NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[productId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 6/30/2021 5:34:07 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[userId] [int] IDENTITY(1,1) NOT NULL,
	[userName] [varchar](100) NOT NULL,
	[password] [varchar](100) NOT NULL,
	[fullName] [nvarchar](150) NOT NULL,
	[phone] [varchar](150) NOT NULL,
	[address] [nvarchar](200) NOT NULL,
	[gender] [bit] NULL,
	[role] [varchar](100) NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[userId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Wish]    Script Date: 6/30/2021 5:34:07 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Wish](
	[userId] [int] NULL,
	[productId] [int] NULL,
	[price] [float] NULL,
	[image] [text] NULL,
	[inStock] [bit] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Cart] ON 
GO
INSERT [dbo].[Cart] ([cartId], [userId], [productId], [quantity]) VALUES (2, 2, 3, 3)
GO
INSERT [dbo].[Cart] ([cartId], [userId], [productId], [quantity]) VALUES (6, 4, 4, 4)
GO
INSERT [dbo].[Cart] ([cartId], [userId], [productId], [quantity]) VALUES (7, 4, 4, 4)
GO
INSERT [dbo].[Cart] ([cartId], [userId], [productId], [quantity]) VALUES (10, 4, 4, 4)
GO
INSERT [dbo].[Cart] ([cartId], [userId], [productId], [quantity]) VALUES (11, 4, 4, 4)
GO
INSERT [dbo].[Cart] ([cartId], [userId], [productId], [quantity]) VALUES (28, 5, 7, 2)
GO
INSERT [dbo].[Cart] ([cartId], [userId], [productId], [quantity]) VALUES (1027, 6, 4, 3)
GO
INSERT [dbo].[Cart] ([cartId], [userId], [productId], [quantity]) VALUES (2034, 2018, 3, 1)
GO
INSERT [dbo].[Cart] ([cartId], [userId], [productId], [quantity]) VALUES (2035, 2018, 3013, 1)
GO
INSERT [dbo].[Cart] ([cartId], [userId], [productId], [quantity]) VALUES (2036, 2018, 4013, 1)
GO
SET IDENTITY_INSERT [dbo].[Cart] OFF
GO
INSERT [dbo].[Categories] ([categoryId], [categoryName], [categoryImage]) VALUES (1, N'Quần', N'q1.jpg')
GO
INSERT [dbo].[Categories] ([categoryId], [categoryName], [categoryImage]) VALUES (2, N'Áo', N'a3.jpg')
GO
INSERT [dbo].[Categories] ([categoryId], [categoryName], [categoryImage]) VALUES (3, N'Túi xách', N't1.jpg')
GO
INSERT [dbo].[Categories] ([categoryId], [categoryName], [categoryImage]) VALUES (4, N'Giày', N'g1.jpg')
GO
INSERT [dbo].[Categories] ([categoryId], [categoryName], [categoryImage]) VALUES (5, N'Đồng hồ', N'd1.jpg')
GO
INSERT [dbo].[Categories] ([categoryId], [categoryName], [categoryImage]) VALUES (6, N'Ví', N'v1.jpg')
GO
SET IDENTITY_INSERT [dbo].[Orders] ON 
GO
INSERT [dbo].[Orders] ([orderId], [userId], [productId], [quantity], [orderDate], [status]) VALUES (175, 17, 4, 1, CAST(N'2021-06-25' AS Date), N'success')
GO
INSERT [dbo].[Orders] ([orderId], [userId], [productId], [quantity], [orderDate], [status]) VALUES (1172, 3, 3, 1, CAST(N'2021-06-26' AS Date), N'waiting_line')
GO
INSERT [dbo].[Orders] ([orderId], [userId], [productId], [quantity], [orderDate], [status]) VALUES (1173, 2019, 4, 1, CAST(N'2021-06-28' AS Date), N'success')
GO
INSERT [dbo].[Orders] ([orderId], [userId], [productId], [quantity], [orderDate], [status]) VALUES (1174, 2019, 5, 1, CAST(N'2021-06-28' AS Date), N'success')
GO
INSERT [dbo].[Orders] ([orderId], [userId], [productId], [quantity], [orderDate], [status]) VALUES (1175, 2016, 6, 1, CAST(N'2021-06-28' AS Date), N'waiting_line')
GO
INSERT [dbo].[Orders] ([orderId], [userId], [productId], [quantity], [orderDate], [status]) VALUES (1176, 2016, 3012, 1, CAST(N'2021-06-28' AS Date), N'waiting_line')
GO
INSERT [dbo].[Orders] ([orderId], [userId], [productId], [quantity], [orderDate], [status]) VALUES (1177, 2019, 4, 1, CAST(N'2021-06-28' AS Date), N'waiting_line')
GO
SET IDENTITY_INSERT [dbo].[Orders] OFF
GO
SET IDENTITY_INSERT [dbo].[Product] ON 
GO
INSERT [dbo].[Product] ([productId], [categoryId], [productName], [price], [size], [quantity], [productDescription], [image]) VALUES (3, 1, N'Quần Gucci', 189, N'XL', 11, N'Quần loại xịn', N'q1.jpg')
GO
INSERT [dbo].[Product] ([productId], [categoryId], [productName], [price], [size], [quantity], [productDescription], [image]) VALUES (4, 2, N'Áo Gucci', 340, N'XXL', 123, N'Áo chip gucci', N'a1.jpg')
GO
INSERT [dbo].[Product] ([productId], [categoryId], [productName], [price], [size], [quantity], [productDescription], [image]) VALUES (5, 3, N'Túi sách', 890, N'M', 90, N'Túi xách hàng limited', N't1.jpg')
GO
INSERT [dbo].[Product] ([productId], [categoryId], [productName], [price], [size], [quantity], [productDescription], [image]) VALUES (6, 4, N'Giày gucci', 20, N'XL', 8, N'Quần này chất oke', N'q3.jpg')
GO
INSERT [dbo].[Product] ([productId], [categoryId], [productName], [price], [size], [quantity], [productDescription], [image]) VALUES (7, 5, N'Đồng hồ con rắn', 920, N'21', 4, N'Đây là cái gì đó', N'd1.jpg')
GO
INSERT [dbo].[Product] ([productId], [categoryId], [productName], [price], [size], [quantity], [productDescription], [image]) VALUES (3012, 5, N'Đồng hồ hiệu', 220, N'S', 2, N'                                        Đây là đồng hồ hiệu nè', N'd2.jpg')
GO
INSERT [dbo].[Product] ([productId], [categoryId], [productName], [price], [size], [quantity], [productDescription], [image]) VALUES (3013, 1, N'abc', 320, N'S', 20, N'                                                                                                                                    ÃÂÃÂÃÂÃÂ¢y lÃÂÃÂ  quÃÂ¡ÃÂºÃÂ§n ÃÂÃÂÃÂÃÂ¹i chÃÂ¡ÃÂºÃÂ¥t
                                        
                                        
                                        ', N'q3.jpg')
GO
INSERT [dbo].[Product] ([productId], [categoryId], [productName], [price], [size], [quantity], [productDescription], [image]) VALUES (4013, 5, N'Watch xịn mịn', 999, N'S', 2, N'                             Đẳng cấp           ', N'd3.jpg')
GO
SET IDENTITY_INSERT [dbo].[Product] OFF
GO
SET IDENTITY_INSERT [dbo].[User] ON 
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (1, N'Admin', N'admin', N'Admin', N'123456789', N'Thái Nguyên', 1, N'ROLE_admin')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (2, N'ThoaiTV', N'thoai', N'Tạ Văn Thoại', N'0352231102', N'Thái Nguyên', 1, N'ROLE_admin')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (3, N'a', N'a', N'Frankfurt', N'Phone', N'adres', 1, N'ROLE_member')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (4, N'adam', N'adam', N'Đây là Adam', N'123456', N'Hòa Lạc', 1, N'ROLE_member')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (5, N'EVA', N'EVA', N'4', N'Hoa lac', N'6', 1, N'ROLE_user')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (17, N'thoai3', N'pass', N'thoai', N'123', N'NM', 0, N'ROLE_user')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (18, N'thoai5', N'asd', N'thoaiii', N'phone', N'day la addess', 1, N'ROLE_user')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (2013, N'NewUser', N'123', N'người dùng mới', N'0352231102', N'Bắc Ninh', 0, N'ROLE_user')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (2016, N'asd', N'a', N'ad', N'222', N'a', 0, N'ROLE_user')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (2017, N'asdsddd', N'a', N'a', N'123', N'e', 0, N'ROLE_user')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (2018, N'thoai6', N'thoai', N'thoai6', N'789', N'89', 0, N'ROLE_user')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (2019, N'thoai7', N'555', N'thoai', N'555', N'555', 0, N'ROLE_user')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (2020, N'thoai8', N'hihi', N'Tin123', N'12131', N'1231', 0, N'ROLE_user')
GO
INSERT [dbo].[User] ([userId], [userName], [password], [fullName], [phone], [address], [gender], [role]) VALUES (3013, N'Thoai9', N'a', N'Thoai9', N'01234', N'Thoai9', 0, N'ROLE_user')
GO
SET IDENTITY_INSERT [dbo].[User] OFF
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_Product] FOREIGN KEY([productId])
REFERENCES [dbo].[Product] ([productId])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_Product]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_User] FOREIGN KEY([userId])
REFERENCES [dbo].[User] ([userId])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_User]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_Categories] FOREIGN KEY([categoryId])
REFERENCES [dbo].[Categories] ([categoryId])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_Categories]
GO
USE [master]
GO
ALTER DATABASE [Project_Java_Web] SET  READ_WRITE 
GO
