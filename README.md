# Java-Basic<html><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8"/><title>Copy of 2nd Semester 20-21 (Aesthetic)</title><style>
/* cspell:disable-file */
/* webkit printing magic: print all background colors */
html {
	-webkit-print-color-adjust: exact;
}
* {
	box-sizing: border-box;
	-webkit-print-color-adjust: exact;
}

html,
body {
	margin: 0;
	padding: 0;
}
@media only screen {
	body {
		margin: 2em auto;
		max-width: 900px;
		color: rgb(55, 53, 47);
	}
}

body {
	line-height: 1.5;
	white-space: pre-wrap;
}

a,
a.visited {
	color: inherit;
	text-decoration: underline;
}

.pdf-relative-link-path {
	font-size: 80%;
	color: #444;
}

h1,
h2,
h3 {
	letter-spacing: -0.01em;
	line-height: 1.2;
	font-weight: 600;
	margin-bottom: 0;
}

.page-title {
	font-size: 2.5rem;
	font-weight: 700;
	margin-top: 0;
	margin-bottom: 0.75em;
}

h1 {
	font-size: 1.875rem;
	margin-top: 1.875rem;
}

h2 {
	font-size: 1.5rem;
	margin-top: 1.5rem;
}

h3 {
	font-size: 1.25rem;
	margin-top: 1.25rem;
}

.source {
	border: 1px solid #ddd;
	border-radius: 3px;
	padding: 1.5em;
	word-break: break-all;
}

.callout {
	border-radius: 3px;
	padding: 1rem;
}

figure {
	margin: 1.25em 0;
	page-break-inside: avoid;
}

figcaption {
	opacity: 0.5;
	font-size: 85%;
	margin-top: 0.5em;
}

mark {
	background-color: transparent;
}

.indented {
	padding-left: 1.5em;
}

hr {
	background: transparent;
	display: block;
	width: 100%;
	height: 1px;
	visibility: visible;
	border: none;
	border-bottom: 1px solid rgba(55, 53, 47, 0.09);
}

img {
	max-width: 100%;
}

@media only print {
	img {
		max-height: 100vh;
		object-fit: contain;
	}
}

@page {
	margin: 1in;
}

.collection-content {
	font-size: 0.875rem;
}

.column-list {
	display: flex;
	justify-content: space-between;
}

.column {
	padding: 0 1em;
}

.column:first-child {
	padding-left: 0;
}

.column:last-child {
	padding-right: 0;
}

.table_of_contents-item {
	display: block;
	font-size: 0.875rem;
	line-height: 1.3;
	padding: 0.125rem;
}

.table_of_contents-indent-1 {
	margin-left: 1.5rem;
}

.table_of_contents-indent-2 {
	margin-left: 3rem;
}

.table_of_contents-indent-3 {
	margin-left: 4.5rem;
}

.table_of_contents-link {
	text-decoration: none;
	opacity: 0.7;
	border-bottom: 1px solid rgba(55, 53, 47, 0.18);
}

table,
th,
td {
	border: 1px solid rgba(55, 53, 47, 0.09);
	border-collapse: collapse;
}

table {
	border-left: none;
	border-right: none;
}

th,
td {
	font-weight: normal;
	padding: 0.25em 0.5em;
	line-height: 1.5;
	min-height: 1.5em;
	text-align: left;
}

th {
	color: rgba(55, 53, 47, 0.6);
}

ol,
ul {
	margin: 0;
	margin-block-start: 0.6em;
	margin-block-end: 0.6em;
}

li > ol:first-child,
li > ul:first-child {
	margin-block-start: 0.6em;
}

ul > li {
	list-style: disc;
}

ul.to-do-list {
	text-indent: -1.7em;
}

ul.to-do-list > li {
	list-style: none;
}

.to-do-children-checked {
	text-decoration: line-through;
	opacity: 0.375;
}

ul.toggle > li {
	list-style: none;
}

ul {
	padding-inline-start: 1.7em;
}

ul > li {
	padding-left: 0.1em;
}

ol {
	padding-inline-start: 1.6em;
}

ol > li {
	padding-left: 0.2em;
}

.mono ol {
	padding-inline-start: 2em;
}

.mono ol > li {
	text-indent: -0.4em;
}

.toggle {
	padding-inline-start: 0em;
	list-style-type: none;
}

/* Indent toggle children */
.toggle > li > details {
	padding-left: 1.7em;
}

.toggle > li > details > summary {
	margin-left: -1.1em;
}

.selected-value {
	display: inline-block;
	padding: 0 0.5em;
	background: rgba(206, 205, 202, 0.5);
	border-radius: 3px;
	margin-right: 0.5em;
	margin-top: 0.3em;
	margin-bottom: 0.3em;
	white-space: nowrap;
}

.collection-title {
	display: inline-block;
	margin-right: 1em;
}

.simple-table {
	margin-top: 1em;
	font-size: 0.875rem;
}

.simple-table-header {
	background: rgb(247, 246, 243);
	color: black;
	font-weight: 500;
}

time {
	opacity: 0.5;
}

.icon {
	display: inline-block;
	max-width: 1.2em;
	max-height: 1.2em;
	text-decoration: none;
	vertical-align: text-bottom;
	margin-right: 0.5em;
}

img.icon {
	border-radius: 3px;
}

.user-icon {
	width: 1.5em;
	height: 1.5em;
	border-radius: 100%;
	margin-right: 0.5rem;
}

.user-icon-inner {
	font-size: 0.8em;
}

.text-icon {
	border: 1px solid #000;
	text-align: center;
}

.page-cover-image {
	display: block;
	object-fit: cover;
	width: 100%;
	height: 30vh;
}

.page-header-icon {
	font-size: 3rem;
	margin-bottom: 1rem;
}

.page-header-icon-with-cover {
	margin-top: -0.72em;
	margin-left: 0.07em;
}

.page-header-icon img {
	border-radius: 3px;
}

.link-to-page {
	margin: 1em 0;
	padding: 0;
	border: none;
	font-weight: 500;
}

p > .user {
	opacity: 0.5;
}

td > .user,
td > time {
	white-space: nowrap;
}

input[type="checkbox"] {
	transform: scale(1.5);
	margin-right: 0.6em;
	vertical-align: middle;
}

p {
	margin-top: 0.5em;
	margin-bottom: 0.5em;
}

.image {
	border: none;
	margin: 1.5em 0;
	padding: 0;
	border-radius: 0;
	text-align: center;
}

.code,
code {
	background: rgba(135, 131, 120, 0.15);
	border-radius: 3px;
	padding: 0.2em 0.4em;
	border-radius: 3px;
	font-size: 85%;
	tab-size: 2;
}

code {
	color: #eb5757;
}

.code {
	padding: 1.5em 1em;
}

.code-wrap {
	white-space: pre-wrap;
	word-break: break-all;
}

.code > code {
	background: none;
	padding: 0;
	font-size: 100%;
	color: inherit;
}

blockquote {
	font-size: 1.25em;
	margin: 1em 0;
	padding-left: 1em;
	border-left: 3px solid rgb(55, 53, 47);
}

.bookmark {
	text-decoration: none;
	max-height: 8em;
	padding: 0;
	display: flex;
	width: 100%;
	align-items: stretch;
}

.bookmark-title {
	font-size: 0.85em;
	overflow: hidden;
	text-overflow: ellipsis;
	height: 1.75em;
	white-space: nowrap;
}

.bookmark-text {
	display: flex;
	flex-direction: column;
}

.bookmark-info {
	flex: 4 1 180px;
	padding: 12px 14px 14px;
	display: flex;
	flex-direction: column;
	justify-content: space-between;
}

.bookmark-image {
	width: 33%;
	flex: 1 1 180px;
	display: block;
	position: relative;
	object-fit: cover;
	border-radius: 1px;
}

.bookmark-description {
	color: rgba(55, 53, 47, 0.6);
	font-size: 0.75em;
	overflow: hidden;
	max-height: 4.5em;
	word-break: break-word;
}

.bookmark-href {
	font-size: 0.75em;
	margin-top: 0.25em;
}

.sans { font-family: ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol"; }
.code { font-family: "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace; }
.serif { font-family: Lyon-Text, Georgia, ui-serif, serif; }
.mono { font-family: iawriter-mono, Nitti, Menlo, Courier, monospace; }
.pdf .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK JP'; }
.pdf:lang(zh-CN) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK SC'; }
.pdf:lang(zh-TW) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK TC'; }
.pdf:lang(ko-KR) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK KR'; }
.pdf .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK JP'; }
.pdf:lang(zh-CN) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK SC'; }
.pdf:lang(zh-TW) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK TC'; }
.pdf:lang(ko-KR) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK KR'; }
.pdf .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK JP'; }
.pdf:lang(zh-CN) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK SC'; }
.pdf:lang(zh-TW) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK TC'; }
.pdf:lang(ko-KR) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK KR'; }
.pdf .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK JP'; }
.pdf:lang(zh-CN) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK SC'; }
.pdf:lang(zh-TW) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK TC'; }
.pdf:lang(ko-KR) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK KR'; }
.highlight-default {
	color: rgba(55, 53, 47, 1);
}
.highlight-gray {
	color: rgba(120, 119, 116, 1);
	fill: rgba(145, 145, 142, 1);
}
.highlight-brown {
	color: rgba(159, 107, 83, 1);
	fill: rgba(187, 132, 108, 1);
}
.highlight-orange {
	color: rgba(217, 115, 13, 1);
	fill: rgba(215, 129, 58, 1);
}
.highlight-yellow {
	color: rgba(203, 145, 47, 1);
	fill: rgba(203, 148, 51, 1);
}
.highlight-teal {
	color: rgba(68, 131, 97, 1);
	fill: rgba(108, 155, 125, 1);
}
.highlight-blue {
	color: rgba(51, 126, 169, 1);
	fill: rgba(91, 151, 189, 1);
}
.highlight-purple {
	color: rgba(144, 101, 176, 1);
	fill: rgba(167, 130, 195, 1);
}
.highlight-pink {
	color: rgba(193, 76, 138, 1);
	fill: rgba(205, 116, 159, 1);
}
.highlight-red {
	color: rgba(212, 76, 71, 1);
	fill: rgba(225, 111, 100, 1);
}
.highlight-gray_background {
	background: rgba(241, 241, 239, 1);
}
.highlight-brown_background {
	background: rgba(244, 238, 238, 1);
}
.highlight-orange_background {
	background: rgba(251, 236, 221, 1);
}
.highlight-yellow_background {
	background: rgba(251, 243, 219, 1);
}
.highlight-teal_background {
	background: rgba(237, 243, 236, 1);
}
.highlight-blue_background {
	background: rgba(231, 243, 248, 1);
}
.highlight-purple_background {
	background: rgba(244, 240, 247, 0.8);
}
.highlight-pink_background {
	background: rgba(249, 238, 243, 0.8);
}
.highlight-red_background {
	background: rgba(253, 235, 236, 1);
}
.block-color-default {
	color: inherit;
	fill: inherit;
}
.block-color-gray {
	color: rgba(120, 119, 116, 1);
	fill: rgba(145, 145, 142, 1);
}
.block-color-brown {
	color: rgba(159, 107, 83, 1);
	fill: rgba(187, 132, 108, 1);
}
.block-color-orange {
	color: rgba(217, 115, 13, 1);
	fill: rgba(215, 129, 58, 1);
}
.block-color-yellow {
	color: rgba(203, 145, 47, 1);
	fill: rgba(203, 148, 51, 1);
}
.block-color-teal {
	color: rgba(68, 131, 97, 1);
	fill: rgba(108, 155, 125, 1);
}
.block-color-blue {
	color: rgba(51, 126, 169, 1);
	fill: rgba(91, 151, 189, 1);
}
.block-color-purple {
	color: rgba(144, 101, 176, 1);
	fill: rgba(167, 130, 195, 1);
}
.block-color-pink {
	color: rgba(193, 76, 138, 1);
	fill: rgba(205, 116, 159, 1);
}
.block-color-red {
	color: rgba(212, 76, 71, 1);
	fill: rgba(225, 111, 100, 1);
}
.block-color-gray_background {
	background: rgba(241, 241, 239, 1);
}
.block-color-brown_background {
	background: rgba(244, 238, 238, 1);
}
.block-color-orange_background {
	background: rgba(251, 236, 221, 1);
}
.block-color-yellow_background {
	background: rgba(251, 243, 219, 1);
}
.block-color-teal_background {
	background: rgba(237, 243, 236, 1);
}
.block-color-blue_background {
	background: rgba(231, 243, 248, 1);
}
.block-color-purple_background {
	background: rgba(244, 240, 247, 0.8);
}
.block-color-pink_background {
	background: rgba(249, 238, 243, 0.8);
}
.block-color-red_background {
	background: rgba(253, 235, 236, 1);
}
.select-value-color-pink { background-color: rgba(245, 224, 233, 1); }
.select-value-color-purple { background-color: rgba(232, 222, 238, 1); }
.select-value-color-green { background-color: rgba(219, 237, 219, 1); }
.select-value-color-gray { background-color: rgba(227, 226, 224, 1); }
.select-value-color-orange { background-color: rgba(250, 222, 201, 1); }
.select-value-color-brown { background-color: rgba(238, 224, 218, 1); }
.select-value-color-red { background-color: rgba(255, 226, 221, 1); }
.select-value-color-yellow { background-color: rgba(253, 236, 200, 1); }
.select-value-color-blue { background-color: rgba(211, 229, 239, 1); }

.checkbox {
	display: inline-flex;
	vertical-align: text-bottom;
	width: 16;
	height: 16;
	background-size: 16px;
	margin-left: 2px;
	margin-right: 5px;
}

.checkbox-on {
	background-image: url("data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2216%22%20height%3D%2216%22%20viewBox%3D%220%200%2016%2016%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%0A%3Crect%20width%3D%2216%22%20height%3D%2216%22%20fill%3D%22%2358A9D7%22%2F%3E%0A%3Cpath%20d%3D%22M6.71429%2012.2852L14%204.9995L12.7143%203.71436L6.71429%209.71378L3.28571%206.2831L2%207.57092L6.71429%2012.2852Z%22%20fill%3D%22white%22%2F%3E%0A%3C%2Fsvg%3E");
}

.checkbox-off {
	background-image: url("data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2216%22%20height%3D%2216%22%20viewBox%3D%220%200%2016%2016%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%0A%3Crect%20x%3D%220.75%22%20y%3D%220.75%22%20width%3D%2214.5%22%20height%3D%2214.5%22%20fill%3D%22white%22%20stroke%3D%22%2336352F%22%20stroke-width%3D%221.5%22%2F%3E%0A%3C%2Fsvg%3E");
}
	
</style></head><body><article id="a16f2e50-62d9-4627-b0e0-a10ca0fb5d8d" class="page serif"><header><img class="page-cover-image" src="https://images.unsplash.com/photo-1602498456745-e9503b30470b?ixlib=rb-1.2.1&amp;q=85&amp;fm=jpg&amp;crop=entropy&amp;cs=srgb" style="object-position:center 100%"/><div class="page-header-icon page-header-icon-with-cover"><img class="icon" src="Copy%20of%202nd%20Semester%2020-21%20(Aesthetic)%2073a783dbda34496db457372e989092e4/giphy_(21).gif"/></div><h1 class="page-title">Copy of 2nd Semester 20-21 (Aesthetic)</h1></header><div class="page-body"><p id="c54f58a6-5955-473f-b6a5-ab35949db2a2" class=""><span style="border-bottom:0.05em solid">✦ 3rd Year within UP, 2nd year as Non-Major ✦</span> </p><div id="fa9ea6fc-7396-4253-ae3a-423e3a35d313" class="column-list"><div id="207dfa41-33fe-43d3-a457-effa086942a7" style="width:20.833333333333332%" class="column"><figure class="block-color-purple_background callout" style="white-space:pre-wrap;display:flex" id="bc7eb909-d96f-4c09-b7c8-5b386f03f78e"><div style="font-size:1.5em"><span class="icon">☾</span></div><div style="width:100%"><mark class="highlight-purple">Starts on March 1, 2021 to June 19, 2021</mark></div></figure><figure id="57667b54-b589-4523-b92d-1267e74a11dd"><div class="source"><a href="https://indify.co/widgets/live/countdown/MQtldpuno4lGo9imYCfh">https://indify.co/widgets/live/countdown/MQtldpuno4lGo9imYCfh</a></div></figure><p id="abdff6d2-29a2-4ee9-8ec7-4144ff0440d0" class="block-color-purple_background">
</p><figure id="4830b317-58f2-4dea-93f1-cacdcc42ce07"><div class="source"><a href="https://indify.co/widgets/live/clock/orlrDrFTLdKtbz75ypCs">https://indify.co/widgets/live/clock/orlrDrFTLdKtbz75ypCs</a></div></figure><figure id="73a783db-da34-496d-b457-372e989092e4" class="image"><a href="Copy%20of%202nd%20Semester%2020-21%20(Aesthetic)%2073a783dbda34496db457372e989092e4/61d9b393dff8933870591c98ecd8d4ba.jpg"><img style="width:563px" src="Copy%20of%202nd%20Semester%2020-21%20(Aesthetic)%2073a783dbda34496db457372e989092e4/61d9b393dff8933870591c98ecd8d4ba.jpg"/></a></figure><p id="7109ed1d-3578-484d-b03d-52310aa1b2d2" class="">
</p></div><div id="b3c46654-ee41-4899-8701-60c5c8cf7a4b" style="width:54.16666666666667%" class="column"><div id="55655a4b-c964-4489-8661-a93b7f52eb87" class="collection-content"><h4 class="collection-title">☾ classes ☾</h4><table class="collection-content"><thead><tr><th><span class="icon property-icon"><svg viewBox="0 0 14 14" style="width:14px;height:14px;display:block;fill:rgba(55, 53, 47, 0.4);flex-shrink:0;-webkit-backface-visibility:hidden" class="typesTitle"><path d="M7.73943662,8.6971831 C7.77640845,8.7834507 7.81338028,8.8943662 7.81338028,9.00528169 C7.81338028,9.49823944 7.40669014,9.89260563 6.91373239,9.89260563 C6.53169014,9.89260563 6.19894366,9.64612676 6.08802817,9.30105634 L5.75528169,8.33978873 L2.05809859,8.33978873 L1.72535211,9.30105634 C1.61443662,9.64612676 1.2693662,9.89260563 0.887323944,9.89260563 C0.394366197,9.89260563 0,9.49823944 0,9.00528169 C0,8.8943662 0.0246478873,8.7834507 0.0616197183,8.6971831 L2.46478873,2.48591549 C2.68661972,1.90669014 3.24119718,1.5 3.90669014,1.5 C4.55985915,1.5 5.12676056,1.90669014 5.34859155,2.48591549 L7.73943662,8.6971831 Z M2.60035211,6.82394366 L5.21302817,6.82394366 L3.90669014,3.10211268 L2.60035211,6.82394366 Z M11.3996479,3.70598592 C12.7552817,3.70598592 14,4.24823944 14,5.96126761 L14,9.07922535 C14,9.52288732 13.6549296,9.89260563 13.2112676,9.89260563 C12.8169014,9.89260563 12.471831,9.59683099 12.4225352,9.19014085 C12.028169,9.6584507 11.3257042,9.95422535 10.5492958,9.95422535 C9.60035211,9.95422535 8.47887324,9.31338028 8.47887324,7.98239437 C8.47887324,6.58978873 9.60035211,6.08450704 10.5492958,6.08450704 C11.3380282,6.08450704 12.040493,6.33098592 12.4348592,6.81161972 L12.4348592,5.98591549 C12.4348592,5.38204225 11.9172535,4.98767606 11.1285211,4.98767606 C10.6602113,4.98767606 10.2411972,5.11091549 9.80985915,5.38204225 C9.72359155,5.43133803 9.61267606,5.46830986 9.50176056,5.46830986 C9.18133803,5.46830986 8.91021127,5.1971831 8.91021127,4.86443662 C8.91021127,4.64260563 9.0334507,4.44542254 9.19366197,4.34683099 C9.87147887,3.90316901 10.6232394,3.70598592 11.3996479,3.70598592 Z M11.1778169,8.8943662 C11.6830986,8.8943662 12.1760563,8.72183099 12.4348592,8.37676056 L12.4348592,7.63732394 C12.1760563,7.29225352 11.6830986,7.11971831 11.1778169,7.11971831 C10.5616197,7.11971831 10.056338,7.45246479 10.056338,8.0193662 C10.056338,8.57394366 10.5616197,8.8943662 11.1778169,8.8943662 Z M0.65625,11.125 L13.34375,11.125 C13.7061869,11.125 14,11.4188131 14,11.78125 C14,12.1436869 13.7061869,12.4375 13.34375,12.4375 L0.65625,12.4375 C0.293813133,12.4375 4.43857149e-17,12.1436869 0,11.78125 C-4.43857149e-17,11.4188131 0.293813133,11.125 0.65625,11.125 Z"></path></svg></span>Name</th><th><span class="icon property-icon"><svg viewBox="0 0 14 14" style="width:14px;height:14px;display:block;fill:rgba(55, 53, 47, 0.4);flex-shrink:0;-webkit-backface-visibility:hidden" class="typesMultipleSelect"><path d="M4,3 C4,2.447715 4.447715,2 5,2 L12,2 C12.5523,2 13,2.447716 13,3 C13,3.55228 12.5523,4 12,4 L5,4 C4.447715,4 4,3.55228 4,3 Z M4,7 C4,6.447715 4.447715,6 5,6 L12,6 C12.5523,6 13,6.447716 13,7 C13,7.55228 12.5523,8 12,8 L5,8 C4.447715,8 4,7.55228 4,7 Z M4,11 C4,10.447715 4.447715,10 5,10 L12,10 C12.5523,10 13,10.447716 13,11 C13,11.55228 12.5523,12 12,12 L5,12 C4.447715,12 4,11.55228 4,11 Z M2,4 C1.44771525,4 1,3.55228475 1,3 C1,2.44771525 1.44771525,2 2,2 C2.55228475,2 3,2.44771525 3,3 C3,3.55228475 2.55228475,4 2,4 Z M2,8 C1.44771525,8 1,7.55228475 1,7 C1,6.44771525 1.44771525,6 2,6 C2.55228475,6 3,6.44771525 3,7 C3,7.55228475 2.55228475,8 2,8 Z M2,12 C1.44771525,12 1,11.5522847 1,11 C1,10.4477153 1.44771525,10 2,10 C2.55228475,10 3,10.4477153 3,11 C3,11.5522847 2.55228475,12 2,12 Z"></path></svg></span>Day</th><th><span class="icon property-icon"><svg viewBox="0 0 14 14" style="width:14px;height:14px;display:block;fill:rgba(55, 53, 47, 0.4);flex-shrink:0;-webkit-backface-visibility:hidden" class="typesSelect"><path d="M7,13 C10.31348,13 13,10.31371 13,7 C13,3.68629 10.31348,1 7,1 C3.68652,1 1,3.68629 1,7 C1,10.31371 3.68652,13 7,13 Z M3.75098,5.32278 C3.64893,5.19142 3.74268,5 3.90869,5 L10.09131,5 C10.25732,5 10.35107,5.19142 10.24902,5.32278 L7.15771,9.29703 C7.07764,9.39998 6.92236,9.39998 6.84229,9.29703 L3.75098,5.32278 Z"></path></svg></span>Timeslot</th></tr></thead><tbody><tr id="f0da68fb-7b55-4945-8e5b-358b96532f75"><td class="cell-title"><a href="https://www.notion.so/MuL-13-f0da68fb7b5549458e5b358b96532f75"><img class="icon" src="Copy%20of%202nd%20Semester%2020-21%20(Aesthetic)%2073a783dbda34496db457372e989092e4/%E2%98%BE%20classes%20%E2%98%BE%2055655a4bc96444898661a93b7f52eb87/MuL%2013%20f0da68fb7b5549458e5b358b96532f75/giphy_(36).gif"/>MuL 13  </a></td><td class="cell-DZb?"><span class="selected-value select-value-color-pink">Thursday</span><span class="selected-value select-value-color-purple">Tuesday</span></td><td class="cell-{@|R"><span class="selected-value select-value-color-pink">10:00-11:30 am</span></td></tr><tr id="31283216-8b5e-4f30-9515-129339379e2a"><td class="cell-title"><a href="https://www.notion.so/MS-1-312832168b5e4f309515129339379e2a"><img class="icon" src="Copy%20of%202nd%20Semester%2020-21%20(Aesthetic)%2073a783dbda34496db457372e989092e4/%E2%98%BE%20classes%20%E2%98%BE%2055655a4bc96444898661a93b7f52eb87/MS%201%20312832168b5e4f309515129339379e2a/giphy_(37).gif"/>MS 1</a></td><td class="cell-DZb?"><span class="selected-value select-value-color-pink">Thursday</span><span class="selected-value select-value-color-purple">Tuesday</span></td><td class="cell-{@|R"><span class="selected-value select-value-color-green">1:00-2:30 pm</span></td></tr><tr id="d7f56271-f021-4e8e-9dfc-4d942584a78a"><td class="cell-title"><a href="https://www.notion.so/Math-10-d7f56271f0214e8e9dfc4d942584a78a"><img class="icon" src="Copy%20of%202nd%20Semester%2020-21%20(Aesthetic)%2073a783dbda34496db457372e989092e4/%E2%98%BE%20classes%20%E2%98%BE%2055655a4bc96444898661a93b7f52eb87/Math%2010%20d7f56271f0214e8e9dfc4d942584a78a/giphy_(38).gif"/>Math 10 </a></td><td class="cell-DZb?"><span class="selected-value select-value-color-pink">Thursday</span><span class="selected-value select-value-color-purple">Tuesday</span></td><td class="cell-{@|R"><span class="selected-value select-value-color-blue">4:00-5:30 pm</span></td></tr><tr id="2ce72069-013b-4436-a443-493f43e2418e"><td class="cell-title"><a href="https://www.notion.so/Geog-1-2ce72069013b4436a443493f43e2418e"><img class="icon" src="Copy%20of%202nd%20Semester%2020-21%20(Aesthetic)%2073a783dbda34496db457372e989092e4/%E2%98%BE%20classes%20%E2%98%BE%2055655a4bc96444898661a93b7f52eb87/Geog%201%202ce72069013b4436a443493f43e2418e/giphy_(39).gif"/>Geog 1 </a></td><td class="cell-DZb?"><span class="selected-value select-value-color-brown">Friday</span><span class="selected-value select-value-color-orange">Wednesday</span></td><td class="cell-{@|R"><span class="selected-value select-value-color-pink">10:00-11:30 am</span></td></tr><tr id="d1b141a2-104c-4920-95e1-5e1de97d45e5"><td class="cell-title"><a href="https://www.notion.so/Eng-11-d1b141a2104c492095e15e1de97d45e5"><img class="icon" src="Copy%20of%202nd%20Semester%2020-21%20(Aesthetic)%2073a783dbda34496db457372e989092e4/%E2%98%BE%20classes%20%E2%98%BE%2055655a4bc96444898661a93b7f52eb87/Eng%2011%20d1b141a2104c492095e15e1de97d45e5/giphy_(40).gif"/>Eng 11 </a></td><td class="cell-DZb?"><span class="selected-value select-value-color-brown">Friday</span><span class="selected-value select-value-color-orange">Wednesday</span></td><td class="cell-{@|R"><span class="selected-value select-value-color-orange">11:30 am-1:00 pm</span></td></tr><tr id="10cc4f46-0fd0-4ee2-b80f-760ea631a285"><td class="cell-title"><a href="https://www.notion.so/New-Class-10cc4f460fd04ee2b80f760ea631a285">New Class</a></td><td class="cell-DZb?"></td><td class="cell-{@|R"></td></tr></tbody></table></div><p id="e404b1eb-56ae-4612-98ea-82ba4a076bfe" class="">
</p></div><div id="fe7428b0-abb9-4b6b-bca0-f82b2ce70d32" style="width:25.000000000000043%" class="column"><figure id="6ddc2f2e-af2a-446a-8a8e-b2f4269496fe"><div class="source"><a href="https://indify.co/widgets/live/weather/qabxdl6P0lDfY2rASs4j">https://indify.co/widgets/live/weather/qabxdl6P0lDfY2rASs4j</a></div></figure><h3 id="e1cebe4b-6bab-4c66-9797-bdbfcd993f97" class="">☾ color code ☾</h3><p id="8aefdfea-cbc1-474f-a0f4-4834b596c065" class=""><mark class="highlight-orange">mul 13 - orange</mark></p><p id="4c1e3f67-2b22-45b7-a37a-a4fd685a226b" class=""><mark class="highlight-blue">ms 1 - blue</mark></p><p id="184b1f56-eb06-4551-862e-fa3811eed73c" class=""><mark class="highlight-teal">math 10 - green</mark></p><p id="97d89738-77e5-47dd-89d3-40b90e52892d" class=""><mark class="highlight-red">geog 1 - red</mark></p><p id="9578c010-7953-44e6-bdc7-c5486a3ce01a" class=""><mark class="highlight-pink">eng 11 - pink</mark></p><p id="afd6144c-794e-48fa-b139-208d2d564008" class=""><mark class="highlight-purple">hapon 11 - purple</mark></p><h3 id="462271ca-6587-4c45-af04-c478d0434a9e" class="">☾ goals ☾</h3><ul id="6d2dcd6d-f7b4-4c6e-97e6-ff0d3cef96b0" class="bulleted-list"><li style="list-style-type:disc">at least a 1.12 gwa</li></ul><ul id="37cdd5e2-eb55-4b9d-8319-ece2faf4b8af" class="bulleted-list"><li style="list-style-type:disc">apply for shifting</li></ul><ul id="37907e5e-414a-4520-95c5-de43de3873be" class="bulleted-list"><li style="list-style-type:disc">balance acads with the channel</li></ul><ul id="1c933d86-bb3c-42f3-b1e0-8d9c8d52007f" class="bulleted-list"><li style="list-style-type:disc">finish planning for algo </li></ul></div></div><p id="bef40d8d-c24b-4228-99fc-fd4ae085c63e" class="">
</p><p id="974715fe-2542-459c-bff2-1910638bbfba" class="block-color-purple_background">
</p><p id="08d27d4d-f272-45d8-8265-ddf104b564e4" class="">
</p><figure id="a78eea23-00ae-4c36-a6d3-b9b305be9d93" class="link-to-page"><a href="https://www.notion.so/Hapon-11-a78eea2300ae4c36a6d3b9b305be9d93"><img class="icon" src="Copy%20of%202nd%20Semester%2020-21%20(Aesthetic)%2073a783dbda34496db457372e989092e4/Hapon%2011%20a78eea2300ae4c36a6d3b9b305be9d93/giphy_(41).gif"/>Hapon 11 </a></figure></div></article></body></html>
