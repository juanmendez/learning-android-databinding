# Binding with expressions

I made the `Country` model have a new property called `timesVisited`.

The recyclerView has now next to each country several faces which are the total times each country has been visited.

It was easy to do this by making use of

```android:visibility="@{countrySource.timesVisited>=1?View.VISIBLE:View.GONE}"```

In our data element we were required to import the View class.

``` <import type="android.view.View"/>```

That allowed us to bind. We can come with other meaningful data-binding expressions using resources.

```<TextView android:text"@{stringArray/ratingDefinitions[countrySource.stars]}"/>```


Something else we can do at `@resource/strings.xml`

```<string name="welcome">Welcome to %s</string>```

Then in our `activity_wiki.xml`'s toolbar

```app:title="@{@string/welcome(countrySource.name)}"```