# IndicatorSeekBar

[![DOWNLOAD](https://api.bintray.com/packages/warkiz/maven/indicatorseekbar/images/download.svg)](https://bintray.com/warkiz/maven/indicatorseekbar/_latestVersion)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-IndicatorSeekBar-green.svg?style=flat )]( https://android-arsenal.com/details/1/6434 )

## Setup

```gradle
implementation 'co.infinum:IndicatorSeekBar:1.0.0'
```

## Usage
#### Java

```Kotlin

seekBar.setIndicatorTextFormat("€\${PROGRESS}")
val tickPositions = listOf(70.00f, 210.00f, 260.00f, 420.00f, 620.00f, 1000.00f)
seekBar.setTickPositions(tickPositions)
seekBar.setProgress(210f)

seekBar2.setIndicatorTextFormat("$\${PROGRESS}")
val newTickPositions = listOf(0f, 5000f)
val newTickPositions2 = listOf(0f, 500f, 1500f)
val newTickPositions3 = listOf(200.00f, 600.00f, 3000.00f)
seekBar2.setTickPositions(newTickPositions3)

seekBar.addOnProgressChangeListener {
 Log.d("TEST_SEEK_BAR", "Stop $it")

 val rand = (0..2).random()
 when (rand) {
     0 -> seekBar2.setTickPositions(newTickPositions)
     1 -> seekBar2.setTickPositions(newTickPositions2)
     else -> seekBar2.setTickPositions(newTickPositions3)
 }

}

```

## License

	Copyright (C) 2017 zhuangguangquan(庄广权)
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	   http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
