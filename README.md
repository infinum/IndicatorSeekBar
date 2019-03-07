# IndicatorSeekBar

[![DOWNLOAD](https://api.bintray.com/packages/warkiz/maven/indicatorseekbar/images/download.svg)](https://bintray.com/warkiz/maven/indicatorseekbar/_latestVersion)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-IndicatorSeekBar-green.svg?style=flat )]( https://android-arsenal.com/details/1/6434 )

## Setup

```gradle
implementation 'com.github.warkiz.widget:indicatorseekbar:2.1.2'
```

## Usage
#### xml

```xml
<com.warkiz.widget.IndicatorSeekBar
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:isb_max="100"
    app:isb_min="-1.0"
    app:isb_progress="25"
    app:isb_seek_smoothly="true"
    app:isb_ticks_count="5"
    app:isb_show_tick_marks_type="oval"
    app:isb_tick_marks_size="13dp"
    app:isb_tick_marks_drawable="@mipmap/ic_launcher"
    app:isb_show_tick_texts="true"
    app:isb_tick_texts_size="15sp"
    app:isb_tick_texts_color="@color/color_blue"
    app:isb_thumb_color="@color/color_green"
    app:isb_thumb_size="20dp"
    app:isb_show_indicator="rounded_rectangle"
    app:isb_indicator_color="@color/color_gray"
    app:isb_indicator_text_color="@color/colorAccent"
    app:isb_indicator_text_size="18sp"
    app:isb_track_background_color="@color/color_gray"
    app:isb_track_background_size="2dp"
    app:isb_track_progress_color="@color/color_blue"
    app:isb_track_progress_size="4dp"
    app:isb_only_thumb_draggable="false"/>
```

#### Java

```Java

 IndicatorSeekBar seekBar = IndicatorSeekBar
                .with(getContext())
                .max(110)
                .min(10)
                .progress(53)
                .tickCount(7)
                .showTickMarksType(TickMarkType.OVAL)
                .tickMarksColor(getResources().getColor(R.color.color_blue, null))
                .tickMarksSize(13)//dp
                .showTickTexts(true)
                .tickTextsColor(getResources().getColor(R.color.color_pink))
                .tickTextsSize(13)//sp
                .tickTextsTypeFace(Typeface.MONOSPACE)
                .showIndicatorType(IndicatorType.ROUNDED_RECTANGLE)
                .indicatorColor(getResources().getColor(R.color.color_blue))
                .indicatorTextColor(Color.parseColor("#ffffff"))
                .indicatorTextSize(13)//sp
                .thumbColor(getResources().getColor(R.color.colorAccent, null))
                .thumbSize(14)
                .trackProgressColor(getResources().getColor(R.color.colorAccent,null))
                .trackProgressSize(4)
                .trackBackgroundColor(getResources().getColor(R.color.color_gray))
                .trackBackgroundSize(2)
		.onlyThumbDraggable(false)
                .build();

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
