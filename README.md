# 基于Hadoop,Hive,Sqoop,MySQL的日志分析系统

> 🚀 A Big Data Log Analysis and Visualization Dashboard Based on Hadoop

---

## 项目简介 | Introduction

本项目利用Hadoop生态对大规模开发日志进行采集、解析与分析，并将结果实时同步到MySQL数据库，通过高颜值大屏网页进行可视化展示。适用于日志统计、运维监控、数据可视化等大数据场景。

This project processes large-scale development logs with the Hadoop ecosystem, parses and analyzes them, saves results to MySQL, and then visualizes the stats on a beautiful web dashboard. It’s suitable for log analysis, operation monitoring, and big data visualization.

---

## 技术栈 | Tech Stack

- **大数据处理**：Hadoop、MapReduce、（可扩展支持 Spark/Flink 等）
- **数据存储**：MySQL
- **后端服务**：Java（Spring Boot 或 Servlet/JSP）
- **前端可视化**：HTML5、CSS3、JavaScript、[Chart.js](https://www.chartjs.org/)、[particles.js](https://vincentgarreau.com/particles.js/)
- **动画特效**：CSS3、particles.js

---

## 功能亮点 | Features

- 🔥 支持海量日志采集与统计分析
- 📊 实时展示IP访问量排行榜
- 📈 高颜值折线图、饼状图可视化访问趋势和占比
- 🌌 炫酷粒子特效大屏，适用于数据展厅/会议/运维中心
- 🧩 模块化设计，易于拓展（如用户行为分析、日志溯源等）

---

## 页面效果 | Demo

![image-20250605201553626](C:\Users\Lenovo\AppData\Roaming\Typora\typora-user-images\image-20250605201553626.png)

![image-20250605200515483](C:\Users\Lenovo\AppData\Roaming\Typora\typora-user-images\image-20250605200515483.png)![image-20250605200518582](C:\Users\Lenovo\AppData\Roaming\Typora\typora-user-images\image-20250605200518582.png)

---

## 快速开始 | Quick Start

1. **环境准备**

   - Hadoop集群（单机/伪分布/分布式均可）
   - MySQL数据库
   - JDK 8+
   - Node01虚拟机（或指定服务器）

2. **日志采集与分析**

   - 将日志文件上传至 Hadoop HDFS
   - 运行 MapReduce 程序统计各IP访问量
   - 结果写入 MySQL 数据库

3. **可视化大屏**

   - 部署后端服务（如 Spring Boot 或 JSP 项目）
   
   - 启动MySQL服务，确保数据表已导入
   
   - 浏览器访问 `http://your-server-ip:port/项目名/` 查看大屏
   
     

---

## 注意事项 | Important Notes

- ⚠️ **本项目连接的数据库是远程 node01 虚拟机上的 MySQL 数据库，并不是本地数据库。**
- 每次运行页面前请确保 node01 虚拟机已启动且 MySQL 服务正在运行，否则网页将无法获取和展示数据。

---

## 目录结构 | Project Structure

```text
.
├── hadoop-log-analysis/         # Hadoop日志分析Java代码
├── web/                        # 大屏前端页面(html/css/js)
├── backend/                    # 后端服务（如Spring Boot/JSP等）
├── doc/                        # 项目文档
├── README.md                   # 项目说明
```

---

## 主要页面 | Main Pages

- **IP访问量明细表**：展示所有IP及其访问次数
- **折线图**：展示访问量趋势
- **饼状图**：展示Top IP访问占比
- **大屏背景**：粒子动画、渐变高亮，科技感十足

---

## 致谢 | Thanks

- [Chart.js](https://www.chartjs.org/) 极简而强大的前端图表库
- [particles.js](https://vincentgarreau.com/particles.js/) 炫酷粒子动画
- 感谢所有大数据开源社区

---

## License

MIT

---

如需进一步定制或遇到问题，欢迎提Issue或联系作者！
