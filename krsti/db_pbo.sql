-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 12 Nov 2019 pada 17.44
-- Versi server: 10.1.34-MariaDB
-- Versi PHP: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_ambil_matakuliah`
--

CREATE TABLE `tb_ambil_matakuliah` (
  `id` int(12) NOT NULL,
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `smt` int(2) NOT NULL,
  `id_user` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_ambil_matakuliah`
--

INSERT INTO `tb_ambil_matakuliah` (`id`, `kode_matkul`, `nama_matkul`, `sks`, `js`, `smt`, `id_user`) VALUES
(9, 'NINF6005', 'Sistem Digital', 3, 4, 1, '180535632556');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_matakuliah`
--

CREATE TABLE `tb_matakuliah` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `smt` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_matakuliah`
--

INSERT INTO `tb_matakuliah` (`kode_matkul`, `nama_matkul`, `sks`, `js`, `smt`, `prasyarat`) VALUES
('UNIV6001', 'Pendidikan Agama Islam', 3, 3, 6, ''),
('UNIV6002', 'Pendidikan Agama Protestan', 3, 3, 6, ''),
('UNIV6003', 'Pendidikan Agama Katolik', 3, 3, 6, ''),
('UNIV6004', 'Pendidikan Agama Hindu', 3, 3, 6, ''),
('UNIV6005', 'Pendidikan Agama Budha', 3, 3, 6, ''),
('UNIV6006', 'Pendidikan Agama Konghucu', 3, 3, 6, ''),
('UNIV6007', 'Pendidikan Pancasila', 2, 2, 7, ''),
('UNIV6008', 'Pendidikan Kewarganegaraan', 2, 2, 4, ''),
('UNIV6009', 'Bahasa Indonesia', 2, 2, 3, ''),
('UNIV6010', 'Manajemen Inovasi', 3, 3, 5, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_matakuliah_peminatan`
--

CREATE TABLE `tb_matakuliah_peminatan` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `smt` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_matakuliah_peminatan`
--

INSERT INTO `tb_matakuliah_peminatan` (`kode_matkul`, `nama_matkul`, `sks`, `js`, `smt`, `prasyarat`) VALUES
('NINF6041', 'Pengolahan Citra', 0, 0, 0, ''),
('NINF6042', 'Kriptografi', 3, 3, 0, ''),
('NINF6043', 'Game Programming', 3, 3, 0, ''),
('NINF6044', 'Proyek Game', 3, 3, 0, ''),
('NINF6045', 'Keamanan Jaringan Komputer', 3, 3, 0, ''),
('NINF6046', 'Machine Learning', 3, 3, 0, ''),
('NINF6047', 'Teknologi Open Source', 3, 3, 0, ''),
('NINF6048', 'Basis Data Terdistribusi', 3, 3, 0, ''),
('NINF6049', 'Teknik Kompilasi', 3, 3, 0, ''),
('NINF6050', 'Pemrograman Jaringan', 3, 3, 0, ''),
('NINF6051', 'Information Retrieval', 3, 3, 0, ''),
('NINF6052', 'Proyek Animasi', 3, 3, 0, ''),
('NINF6053', 'Multimedia Database', 3, 3, 0, ''),
('NINF6054', 'Virtual Reality', 3, 3, 0, ''),
('NINF6055', 'Computer Vision', 3, 3, 0, ''),
('NINF6062', 'Jaringan Multimedia', 3, 3, 0, ''),
('NINF6056', 'Semantic Web', 3, 3, 0, ''),
('NINF6057', 'Data Mining', 3, 3, 0, ''),
('NINF6058', 'Datawarehousing', 3, 3, 0, ''),
('NINF6059', 'Grid Computing', 3, 3, 0, ''),
('NINF6060', 'Ubiquitos System', 3, 3, 0, ''),
('UKKN6090', 'KKN', 4, 4, 0, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_matakuliah_wajib`
--

CREATE TABLE `tb_matakuliah_wajib` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `smt` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_matakuliah_wajib`
--

INSERT INTO `tb_matakuliah_wajib` (`kode_matkul`, `nama_matkul`, `sks`, `js`, `smt`, `prasyarat`) VALUES
('NINF6004', 'Pengantar Teknologi Informasi', 2, 2, 1, ''),
('NINF6005', 'Sistem Digital', 3, 4, 1, ''),
('NINF6006', 'Algoritma dan Pemrograman', 3, 4, 1, ''),
('NINF6007', 'Matematika Diskrit', 3, 3, 1, ''),
('NINF6010', 'Organisasi dan Arsitektur Komputer', 3, 3, 2, 'NINF6005'),
('NINF6011', 'Basis Data I', 3, 4, 2, ''),
('NINF6012', 'Struktur Data ', 3, 4, 2, 'NINF6006'),
('NINF6016', 'Pemrograman Web', 3, 4, 3, 'NINF6006'),
('NINF6017', 'Sistem Operasi', 3, 3, 3, ''),
('NINF6018', 'Teori Bahasa dan Otomata', 3, 3, 3, 'NINF6006'),
('NINF6023', 'Rekayasa Perangkat Lunak', 3, 3, 4, ''),
('NINF6019', 'Pemrograman Berorientasi Obyek', 3, 4, 3, 'NINF6006'),
('NINF6006', 'Basis Data II', 3, 4, 3, 'NINF6011'),
('NINF6024', 'Komunikasi Data dan Jaringan Komputer', 3, 3, 4, ''),
('NINF6025', 'Komputasi Numerik', 3, 3, 4, ''),
('NINF6026', 'Grafika Komputer', 3, 4, 4, 'NINF6014'),
('NINF6015', 'Sistem Informasi', 3, 3, 2, ''),
('NINF6027', 'Pemrograman Deklaratif', 3, 4, 4, 'NINF6006'),
('NINF6028', 'Kecerdasan Buatan', 3, 4, 5, 'NINF6006'),
('NINF6029', 'Multimedia', 3, 4, 5, ''),
('NINF6030', 'Proyek Perangkat Lunak', 3, 4, 5, 'NINF6023'),
('NINF6031', 'Analisis dan Desain Algoritma', 3, 3, 5, 'NINF6012'),
('NINF6032', 'Interaksi Manusia dan Komputer', 3, 4, 5, ''),
('NINF6033', 'Analisis dan Desain Sistem', 3, 4, 5, 'NINF6023'),
('NINF6036', 'Mobile dan Wireless Computing', 3, 4, 6, 'NINF6024'),
('NINF6037', 'Sosioteknologi Informatika', 2, 2, 6, 'NINF6004'),
('NINF6002', 'Kalkulus I', 3, 3, 1, ''),
('NINF6009', 'Kalkulus II', 3, 3, 2, 'NINF6002'),
('NINF6022', 'Probabilitas dan Statistik', 3, 3, 4, ''),
('NINF6034', 'Metodologi Penelitian', 2, 2, 6, ''),
('NINF6008', 'Bahasa Inggris Teknik I', 2, 2, 1, ''),
('NINF6013', 'Bahasa Inggris Teknik II', 2, 2, 2, 'NINF6008'),
('NINF6014', 'Aljabar Linier', 3, 3, 2, ''),
('NINF6021', 'Kalkulus Lanjut', 3, 3, 3, 'NINF6009'),
('NINF6001', 'Komunikasi Interpersonal', 2, 2, 1, ''),
('NINF6003', 'K3LH', 2, 2, 1, ''),
('NINF6035', 'Technopreneurship', 2, 2, 6, ''),
('UPKL6090', 'Praktik Kerja Industri', 4, 4, 8, ''),
('NINF6038', 'Seminar Pra Skripsi', 1, 2, 7, 'NINF6034'),
('NINF6040', 'Skripsi', 4, 16, 8, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_matkul_pilihan`
--

CREATE TABLE `tb_matkul_pilihan` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_matkul_pilihan`
--

INSERT INTO `tb_matkul_pilihan` (`kode_matkul`, `nama_matkul`, `course_name`, `sks`, `js`) VALUES
('NINF6041', 'Pengolahan Citra', 'Image processing', 3, 3),
('NINF6042', 'Kriptografi', 'Cryptography', 3, 3),
('NINF6043', 'Game Programming', 'Game Programming', 3, 3),
('NINF6044', 'Proyek Game', 'Game Project', 3, 3),
('NINF6045', 'Keamanan Jaringan Komputer', 'Computer Network Security', 3, 3),
('NINF6046', 'Machine Learning', 'Machine Learning', 3, 3),
('NINF6047', 'Teknologi Open Source', 'Open Source Technology', 3, 3),
('NINF6048', 'Basis Data Terdistribusi', 'Distributed Database', 3, 3),
('NINF6049', 'Teknik Kompilasi', 'Compilation Technique', 3, 3),
('NINF6050', 'Pemrograman Jaringan', 'Network Programming', 3, 3),
('NINF6051', 'Information Retrieval', 'Information Retrieval', 3, 3),
('NINF6052', 'Proyek Animasi', 'Animation Project', 3, 3),
('NINF6053', 'Multimedia Database', 'Multimedia Database', 3, 3),
('NINF6054', 'Virtual Reality', 'Virtual Reality', 3, 3),
('NINF6055', 'Computer Vision', 'Computer Vision', 3, 3),
('NINF6062', 'Jaringan Multimedia', 'Multimedia Network', 3, 3),
('NINF6056', 'Semantic Web', 'Semantic Web', 3, 3),
('NINF6057', 'Data Mining', 'Data Mining', 3, 3),
('NINF6058', 'Datawarehousing', 'Datawarehousing', 3, 3),
('NINF6059', 'Grid Computing', 'Grid Computing', 3, 3),
('NINF6060', 'Ubiquitos System', 'Ubiquitos System', 3, 3),
('UKKN6090', 'KKN', 'Community Service Program', 4, 4);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_semester`
--

CREATE TABLE `tb_semester` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_semester`
--

INSERT INTO `tb_semester` (`kode_matkul`, `nama_matkul`, `course_name`, `sks`, `js`, `prasyarat`) VALUES
('NINF6001', 'Komunikasi Interpersonal', 'Komunikasi Interpersonal', 2, 2, ''),
('NINF6002', 'Kalkulus I', 'Calculus I', 3, 3, ''),
('NINF6003', 'K3LH', 'Health, Safety and Environment', 2, 2, ''),
('NINF6004', 'Pengantar Teknologi Informasi', 'Introduction to Information Technology', 2, 2, ''),
('NINF6005', 'Sistem Digital', 'Digital System', 3, 4, ''),
('NINF6006', 'Algoritma dan Pemrograman', 'Algorithms and Programming', 3, 4, ''),
('NINF6007', 'Matematika Diskrit', 'Discrete mathematics', 3, 3, ''),
('NINF6008', 'Bahasa Inggris Teknik I', 'Technical English I', 2, 2, ''),
('NINF6009', 'Kalkulus II', 'Calculus II', 3, 3, 'NINF6002'),
('NINF6010', 'Organisasi dan Arsitektur Komputer', 'Organization and Computer Architecture', 3, 3, 'NINF6005'),
('NINF6011', 'Basis Data I', 'Database I', 3, 4, ''),
('NINF6012', 'Struktur Data ', 'Data Structure', 3, 4, 'NINF6006'),
('NINF6013', 'Bahasa Inggris Teknik II', 'Technical English II', 2, 2, 'NINF6008'),
('NINF6014', 'Aljabar Linier', 'Linear Algebra', 3, 3, ''),
('NINF6015', 'Sistem Informasi', 'Information Systems', 3, 3, ''),
('NINF6016', 'Pemrograman Web', 'Web Programming', 3, 4, 'NINF6006'),
('NINF6017', 'Sistem Operasi', 'Sistem Operasi', 3, 3, ''),
('NINF6018', 'Teori Bahasa dan Otomata', 'Language and Automata Theory', 3, 3, 'NINF6006'),
('NINF6019', 'Pemrograman Berorientasi Obyek', 'Object Oriented Programming', 3, 4, 'NINF6006'),
('NINF6020', 'Basis Data II', 'Database II', 3, 4, 'NINF6011'),
('NINF6021', 'Kalkulus Lanjut', 'Advanced Calculus', 3, 3, 'NINF6009'),
('NINF6022', 'Probabilitas dan Statistik', 'Probability and Statistics', 3, 3, ''),
('NINF6023', 'Rekayasa Perangkat Lunak', 'Software engineering', 3, 3, ''),
('NINF6024', 'Komunikasi Data dan Jaringan Komputer', 'Data Communications and Computer Networks', 3, 3, ''),
('NINF6025', 'Komputasi Numerik', 'Numerical Computing', 3, 3, ''),
('NINF6026', 'Grafika Komputer', 'Computer Graphics', 3, 4, 'NINF6014'),
('NINF6027', 'Pemrograman Deklaratif', 'Declarative Programming', 3, 4, 'NINF6006'),
('NINF6028', 'Kecerdasan Buatan', 'Artificial intelligence', 3, 4, 'NINF6006'),
('NINF6029', 'Multimedia', 'Multimedia', 3, 4, ''),
('NINF6030', 'Proyek Perangkat Lunak', 'Project Software', 3, 4, 'NINF6023'),
('NINF6031', 'Analisis dan Desain Algoritma', 'Analysis and Design of Algorithms', 3, 3, 'NINF6012'),
('NINF6032', 'Interaksi Manusia dan Komputer', 'Human and Computer Interaction', 3, 4, ''),
('NINF6033', 'Analisis dan Desain Sistem', 'Systems Analysis and Design', 3, 4, 'NINF6023'),
('NINF6034', 'Metodologi Penelitian', 'Research methodology', 2, 2, ''),
('NINF6035', 'Technopreneurship', 'Technopreneurship', 2, 2, ''),
('NINF6036', 'Mobile dan Wireless Computing', 'Mobile and Wireless Computing', 3, 4, 'NINF6024'),
('NINF6037', 'Sosioteknologi Informatika', 'Sociotechnology Informatics', 2, 2, 'NINF6004'),
('UNIV6001', 'Pendidikan Agama Islam ', 'Pendidikan Agama Islam ', 3, 3, ''),
('UNIV6002', 'Pendidikan Agama Protestan ', 'Protestant Religion Education ', 3, 3, ''),
('UNIV6003', 'Pendidikan Agama Katolik ', 'Catholic Religious Education ', 3, 3, ''),
('UNIV6004', 'Pendidikan Agama Hindu ', 'Hindu Religious Education ', 3, 3, ''),
('UNIV6005', 'Pendidikan Agama Budha ', 'Buddhist Religious Education ', 3, 3, ''),
('UNIV6006', 'Pendidikan Agama Konghucu ', 'Confucian Religion Education ', 3, 3, ''),
('UNIV6008', 'Pendidikan Kewarganegaraan', 'Civic Education', 2, 2, ''),
('UNIV6009', 'Bahasa Indonesia', 'Indonesian', 2, 2, ''),
('UNIV6010', 'Manajemen Inovasi', 'Innovation Management', 3, 3, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_semester1`
--

CREATE TABLE `tb_semester1` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_semester1`
--

INSERT INTO `tb_semester1` (`kode_matkul`, `nama_matkul`, `course_name`, `sks`, `js`, `prasyarat`) VALUES
('NINF6004', 'Pengantar Teknologi Informasi', 'Introduction to Information Technology', 2, 2, ''),
('NINF6005', 'Sistem Digital', 'Digital System', 3, 4, ''),
('NINF6006', 'Algoritma dan Pemrograman', 'Algorithms and Programming', 3, 4, ''),
('NINF6007', 'Matematika Diskrit', 'Discrete mathematics', 3, 3, ''),
('NINF6002', 'Kalkulus I', 'Calculus I', 3, 3, ''),
('NINF6008', 'Bahasa Inggris Teknik I', 'Technical English I', 2, 2, ''),
('NINF6001', 'Komunikasi Interpersonal', 'Komunikasi Interpersonal', 2, 2, ''),
('NINF6003', 'K3LH', 'Health, Safety and Environment', 2, 2, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_semester2`
--

CREATE TABLE `tb_semester2` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_semester2`
--

INSERT INTO `tb_semester2` (`kode_matkul`, `nama_matkul`, `course_name`, `sks`, `js`, `prasyarat`) VALUES
('NINF6010', 'Organisasi dan Arsitektur Komputer', 'Organization and Computer Architecture', 3, 3, 'NINF6005'),
('NINF6011', 'Basis Data I', 'Database I', 3, 4, ''),
('NINF6012', 'Struktur Data ', 'Data Structure', 3, 4, 'NINF6006'),
('NINF6015', 'Sistem Informasi', 'Information Systems', 3, 3, ''),
('NINF6009', 'Kalkulus II', 'Calculus II', 3, 3, 'NINF6002'),
('NINF6013', 'Bahasa Inggris Teknik II', 'Technical English II', 2, 2, 'NINF6008'),
('NINF6014', 'Aljabar Linier', 'Linear Algebra', 3, 3, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_semester3`
--

CREATE TABLE `tb_semester3` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_semester3`
--

INSERT INTO `tb_semester3` (`kode_matkul`, `nama_matkul`, `course_name`, `sks`, `js`, `prasyarat`) VALUES
('UNIV6009', 'Bahasa Indonesia', 'Indonesian', 2, 2, ''),
('NINF6016', 'Pemrograman Web', 'Web Programming', 3, 4, 'NINF6006'),
('NINF6017', 'Sistem Operasi', 'Sistem Operasi', 3, 3, ''),
('NINF6018', 'Teori Bahasa dan Otomata', 'Language and Automata Theory', 3, 3, 'NINF6006'),
('NINF6019', 'Pemrograman Berorientasi Obyek', 'Object Oriented Programming', 3, 4, 'NINF6006'),
('NINF6020', 'Basis Data II', 'Database II', 3, 4, 'NINF6011'),
('NINF6021', 'Kalkulus Lanjut', 'Advanced Calculus', 3, 3, 'NINF6009');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_semester4`
--

CREATE TABLE `tb_semester4` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_semester4`
--

INSERT INTO `tb_semester4` (`kode_matkul`, `nama_matkul`, `course_name`, `sks`, `js`, `prasyarat`) VALUES
('UNIV6008', 'Pendidikan Kewarganegaraan', 'Civic Education', 2, 2, ''),
('NINF6023', 'Rekayasa Perangkat Lunak', 'Software engineering', 3, 3, ''),
('NINF6024', 'Komunikasi Data dan Jaringan Komputer', 'Data Communications and Computer Networks', 3, 3, ''),
('NINF6025', 'Komputasi Numerik', 'Numerical Computing', 3, 3, ''),
('NINF6026', 'Grafika Komputer', 'Computer Graphics', 3, 4, 'NINF6014'),
('NINF6027', 'Pemrograman Deklaratif', 'Declarative Programming', 3, 4, 'NINF6006'),
('NINF6022', 'Probabilitas dan Statistik', 'Probability and Statistics', 3, 3, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_semester5`
--

CREATE TABLE `tb_semester5` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_semester5`
--

INSERT INTO `tb_semester5` (`kode_matkul`, `nama_matkul`, `course_name`, `sks`, `js`, `prasyarat`) VALUES
('UNIV6010', 'Manajemen Inovasi', 'Innovation Management', 3, 3, ''),
('NINF6028', 'Kecerdasan Buatan', 'Artificial intelligence', 3, 4, 'NINF6006'),
('NINF6029', 'Multimedia', 'Multimedia', 3, 4, ''),
('NINF6030', 'Proyek Perangkat Lunak', 'Project Software', 3, 4, 'NINF6023'),
('NINF6031', 'Analisis dan Desain Algoritma', 'Analysis and Design of Algorithms', 3, 3, 'NINF6012'),
('NINF6032', 'Interaksi Manusia dan Komputer', 'Human and Computer Interaction', 3, 4, ''),
('NINF6033', 'Analisis dan Desain Sistem', 'Systems Analysis and Design', 3, 4, 'NINF6023');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_semester6`
--

CREATE TABLE `tb_semester6` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_semester6`
--

INSERT INTO `tb_semester6` (`kode_matkul`, `nama_matkul`, `course_name`, `sks`, `js`, `prasyarat`) VALUES
('UNIV6001', 'Pendidikan Agama Islam ', 'Pendidikan Agama Islam ', 3, 3, ''),
('UNIV6002', 'Pendidikan Agama Protestan ', 'Protestant Religion Education ', 3, 3, ''),
('UNIV6003', 'Pendidikan Agama Katolik ', 'Catholic Religious Education ', 3, 3, ''),
('UNIV6004', 'Pendidikan Agama Hindu ', 'Hindu Religious Education ', 3, 3, ''),
('UNIV6005', 'Pendidikan Agama Budha ', 'Buddhist Religious Education ', 3, 3, ''),
('UNIV6006', 'Pendidikan Agama Konghucu ', 'Confucian Religion Education ', 3, 3, ''),
('NINF6036', 'Mobile dan Wireless Computing', 'Mobile and Wireless Computing', 3, 4, 'NINF6024'),
('NINF6037', 'Sosioteknologi Informatika', 'Sociotechnology Informatics', 2, 2, 'NINF6004'),
('NINF6034', 'Metodologi Penelitian', 'Research methodology', 2, 2, ''),
('NINF6035', 'Technopreneurship', 'Technopreneurship', 2, 2, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_semester7`
--

CREATE TABLE `tb_semester7` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_semester7`
--

INSERT INTO `tb_semester7` (`kode_matkul`, `nama_matkul`, `course_name`, `sks`, `js`, `prasyarat`) VALUES
('UNIV6007', 'Pendidikan Pancasila', 'Pancasila Education ', 2, 2, ''),
('NINF6038', 'Seminar Pra Skripsi', 'Pre Thesis Seminar', 1, 2, 'NINF6034');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_semester8`
--

CREATE TABLE `tb_semester8` (
  `kode_matkul` varchar(10) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `js` int(2) NOT NULL,
  `prasyarat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_semester8`
--

INSERT INTO `tb_semester8` (`kode_matkul`, `nama_matkul`, `course_name`, `sks`, `js`, `prasyarat`) VALUES
('UPKL6090', 'Praktik Kerja Industri', 'Industrial Work Practices', 4, 4, ''),
('NINF6040', 'Skripsi', 'Thesis', 4, 16, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` int(10) NOT NULL,
  `user` varchar(30) NOT NULL,
  `pass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `user`, `pass`) VALUES
(0, '180535632556', '123456');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_ambil_matakuliah`
--
ALTER TABLE `tb_ambil_matakuliah`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_ambil_matakuliah`
--
ALTER TABLE `tb_ambil_matakuliah`
  MODIFY `id` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
