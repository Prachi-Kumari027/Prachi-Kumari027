from django.http import HttpResponse
from django.shortcuts import render
def home(request):
    return HttpResponse("Hello, World!")
def portfolio(request):
    return render(request,"portfolio.html")
def basic(request):
    return render(request,"basic.html")
def age(request):
    age=None;
    if request.method=="POST":
        a=request.POST.get("age")
        if a:
            age=int(a)
    return render(request,"age.html",{"age":age})