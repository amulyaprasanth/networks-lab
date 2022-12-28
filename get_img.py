import requests 

with open("digital_image_processing.jpg", "wb") as f:
    request = requests.get("https://cdn.educba.com/academy/wp-content/uploads/2019/12/digital-image-processing-1.jpg")
    f.write(request.content)