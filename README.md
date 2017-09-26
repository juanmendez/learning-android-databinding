# Hello Databinding

We experiment with binding the recylerView. In this case our parent view is the one which provides to the current binding the adapter, and layout type.

*   ` binding.list.setAdapter(adapter)`
*   `binding.list.setLayoutManager(layoutManager)`

Making the binding available to the recycleView then helps to also bind each of its listed views.
Checkout `CountryAdapter.ViewHolder`