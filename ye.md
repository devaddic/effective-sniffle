Here’s a **Markdown** version of your request for the R functions `plot()` and `unique()`, including their purpose, package, function headers, parameter options, graphical parameters, and example use cases. The output uses **tables**, **color**, and **formatting** to enhance readability and is ready to be saved or converted to PDF/HTML/Markdown documents.

---

```markdown
# 📊 R Function Reference

---

## 🎨 **1. `plot()` Function**

### 📦 Package: `graphics`

### 🧭 Purpose:
The `plot()` function is a **generic function** for creating a wide variety of plots, including scatterplots, line plots, and more. Its behavior adapts depending on the class of its arguments.

---

### 🔧 Function Header:
```r
plot(x, y = NULL, type = "p", main = NULL, sub = NULL,
     xlab = NULL, ylab = NULL, asp = NA, xlim = NULL,
     ylim = NULL, log = "", ...)
```

---

### 📌 Parameters:

| **Parameter** | **Description** | **Accepted Values** |
|---------------|-----------------|----------------------|
| `x`           | X-coordinates or an object | numeric vector, factor, or object |
| `y`           | Y-coordinates (optional) | numeric or `NULL` |
| `type`        | Type of plot | `"p"`, `"l"`, `"b"`, `"c"`, `"o"`, `"h"`, `"s"`, `"S"`, `"n"` |
| `main`        | Main title | Character string |
| `sub`         | Subtitle | Character string |
| `xlab`, `ylab`| Axis labels | Character string |
| `xlim`, `ylim`| Axis limits | Numeric vector of length 2 |
| `log`         | Log scale axis | `"x"`, `"y"`, `"xy"`, or `""` |
| `asp`         | Aspect ratio | Numeric or `NA` |
| `...`         | Graphical parameters | See below 👇 |

---

### 🎨 Graphical Parameters

| **Parameter** | **Description** | **Accepted Values** |
|---------------|-----------------|----------------------|
| `col`         | Element color | Any color name/hex/index |
| `pch`         | Plotting character | Integers 0–25 or symbols `"*"`, `"+"`, `"o"`, etc. |
| `lty`         | Line type | `"solid"`, `"dashed"`, `"dotted"`, `"dotdash"`, `"longdash"`, `"twodash"` or 1–6 |
| `lwd`         | Line width | Numeric |
| `cex`         | Point/text size | Numeric |
| `bg`          | Background color | Same as `col` |
| `xaxs`, `yaxs`| Axis calculation style | `"r"`, `"i"`, `"e"`, `"s"`, `"d"` |
| `xpd`         | Clipping | `TRUE`, `FALSE`, `NA` |
| `mar`         | Margins | Numeric vector of 4 values |
| `mfrow`, `mfcol` | Multi-plot layout | Integer vector (e.g., `c(2,2)`) |

---

### ✅ Example Use Cases

```r
# Basic scatterplot
plot(1:10, rnorm(10), main = "Basic Scatter", col = "blue", pch = 19)

# Line plot with dotted lines
plot(1:10, rnorm(10), type = "l", col = "red", lty = "dotted", lwd = 2)

# Both lines and points
plot(1:10, rnorm(10), type = "b", col = "darkgreen", pch = 17)
```

---

## 🧹 **2. `unique()` Function**

### 📦 Package: `base`

### 🧭 Purpose:
The `unique()` function extracts the **unique elements** of a vector, data frame, array, or list by **removing duplicate values**.

---

### 🔧 Function Header:
```r
unique(x, incomparables = FALSE, ...)
```

---

### 📌 Parameters:

| **Parameter**     | **Description**                      | **Accepted Values**                        |
|-------------------|--------------------------------------|--------------------------------------------|
| `x`               | Input object                         | vector, data frame, array, list, etc.      |
| `incomparables`   | Exclude values from comparison       | `FALSE`, or a vector of incomparable values|
| `...`             | Extra parameters for methods         | Passed to/from other methods               |

---

### ✅ Example Use Cases

```r
# Vector: Remove duplicates
unique(c(1, 2, 2, 3, 1, 4))
# [1] 1 2 3 4

# Data frame: Unique rows
df <- data.frame(a = c(1,1,2), b = c("x", "x", "y"))
unique(df)
#   a b
# 1 1 x
# 3 2 y
```

---

> ✅ **Tip:** Use `duplicated()` to find duplicates before calling `unique()` if you want more control.

---
```

---

Let me know if you'd like a **PDF version** of this Markdown output — I can generate that for you too!
