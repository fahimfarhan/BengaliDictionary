#```python
import pdftotext

# Load your PDF
f = open("./datasource/Magoosh1000.pdf", "rb")
pdf = pdftotext.PDF(f)

# If it's password-protected
#f =  open("secure.pdf", "rb")
#pdf = pdftotext.PDF(f, "secret")

# How many pages?
#print(len(pdf))

# Iterate over all the pages
for i in range (62,95):
    print(pdf[i])

# Read some individual pages
#print(pdf[0])
#print(pdf[1])

# Read all the text into one string
#print("\n\n".join(pdf))
#```
f.close()