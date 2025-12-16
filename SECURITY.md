# Security Policy

## 🔐 Project Security Overview
This project is a **CLI-based Fleet Route Optimization System** designed for educational and academic purposes. While it does not handle sensitive user data, basic security practices are followed to ensure safe and reliable execution.

---

## 📋 Supported Versions
This project is currently under active development. Only the latest version is supported for security updates.

| Version | Supported |
|--------|-----------|
| Latest | ✅ Yes |
| Older | ❌ No |

---

## 🚨 Reporting a Vulnerability
If you discover a security issue or vulnerability, please report it responsibly.

### How to Report
- Clearly describe the issue
- Mention steps to reproduce (if applicable)
- Specify the affected component (CLI, file handling, logic, etc.)

📧 Contact: *Project maintainer / instructor*  
(For academic projects, report directly to the project guide or team lead.)

---

## 🛡️ Security Measures Implemented
- **Exception Handling**
  - Prevents crashes due to missing routes or vehicle overload
  - Custom exceptions:
    - `RouteNotFoundException`
    - `OverCapacityException`

- **Input Validation**
  - CSV inputs (`routes.csv`, `fleet.csv`) are validated before processing
  - Prevents invalid or null data usage

- **Controlled File Access**
  - Reads and writes only predefined files (`.csv`, `.txt`)
  - No external or network-based access

- **Safe Collections Usage**
  - Uses Java Collections (`Map`, `PriorityQueue`) to avoid unsafe memory operations

---

## ⚠️ Known Limitations
- No encryption is implemented (not required for offline CLI use)
- No user authentication (single-user academic project)
- Not designed for production or real-world deployment

---

## 🧪 Best Practices for Users
- Use trusted input files only
- Do not modify CSV file structure
- Run the application in a controlled local environment

---

## 📘 Disclaimer
This software is intended **strictly for educational purposes**. The developers are not responsible for misuse or deployment in production systems.

---

## ✅ Conclusion
Basic security practices such as exception handling, validation, and controlled access are implemented to ensure stable and secure execution within an academic environment.
